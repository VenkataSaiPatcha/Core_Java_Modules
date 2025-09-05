package MultiThread_Concepts;

class Join extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value ::"+i+" by thread name ::"+name);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread is interrupted"+e);
			}
		}
	}
}
public class JoinDemo01 
{
	public static void main(String[] args)  throws InterruptedException
	{
		Join j1 = new Join();
		Join j2 = new Join();
		Join j3 = new Join();
		
		j1.setName("j1");
		j2.setName("j2");
		j3.setName("j3");
		
		j1.start();
		//j1.join();
		System.out.println("Main thread wake up");
		j2.start();
		//j2.join();
		j3.start();
		System.out.println("Main method ended");
	}

}
