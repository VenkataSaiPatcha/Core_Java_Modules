package MultiThread_Concepts;

class JavaBatchClass implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println("i value is :"+i+" by "+name+" thread");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadGroupDemo01 
{
	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("Batch-39");
		Thread t1 = new Thread(tg, new JavaBatchClass(),"scoot");
		Thread t2 = new Thread(tg, new JavaBatchClass(),"smith");
		Thread t3 = new Thread(tg, new JavaBatchClass(),"Amith");
		Thread t4 = new Thread(tg, new JavaBatchClass(),"John");
		Thread t5 = new Thread(tg, new JavaBatchClass(),"Martin");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println("How many threads are active under Batch-39 thread ::"+tg.activeCount());
		System.out.println("Thread Group name is :"+tg.getName());
	}

}
