package MultiThread_Concepts;

class Delta extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+" value :"+name);
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
class Triangle implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=10;i<=20;i++)
		{
			System.out.println(i+" value "+name);
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

public class JoinDemo05 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main method ended");
		Delta d1 = new Delta();
		Triangle t1 = new Triangle();
		d1.setName("Delta_Thread");
		d1.start();
		d1.join(5000, 1000);
		Thread thread = new Thread(t1);
		thread.setName("Triangle_Thread");
		thread.start();
		//thread.join(1000);
		System.out.println("Main method ended");
	}

}
