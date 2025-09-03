package MultiThread_Concepts;

class SampleClass extends Thread
{
	
	@Override
	public void run()
	{
		System.out.println("child thread id id :"+Thread.currentThread().getId());
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread is interrupted :"+e);
			}
		}
	}
}
public class SleepThread02
{
	public static void main(String[] args) 
	{
		System.out.println("main thread id is :"+Thread.currentThread().getId());
		SampleClass s1 = new SampleClass();
		SampleClass s2 = new SampleClass();
		s1.start();
		s2.start();
		
	}

}
