package MultiThread_Concepts;

class Alpha extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		Beta b1 = new Beta();
		b1.setName("Beta_Thread");
		b1.start();
		try
		{
			b1.join();  // Alpha thread is waiting for beta thread to completed
			System.out.println("Alpha thread re-start");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" by "+name);
		}
	}
}
class Beta extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		for(int i=1;i<=20;i++)
		{
		System.out.println(i+" by "+name);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
		System.out.println("Beta thread ended");
	}
}
public class JoinDemo02
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Alpha a1 = new Alpha();
		a1.setName("Alpha_Thread");
		a1.start();
		System.out.println("Main method ended");
	}

}
