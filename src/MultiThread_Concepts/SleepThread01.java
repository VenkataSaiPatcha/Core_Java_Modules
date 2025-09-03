package MultiThread_Concepts;

class SampleThreadClass extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
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
public class SleepThread01
{
	public static void main(String[] args) 
	{
		SampleThreadClass s1 = new SampleThreadClass();
		s1.start();
	}

}
