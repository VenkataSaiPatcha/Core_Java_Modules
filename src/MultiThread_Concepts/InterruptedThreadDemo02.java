package MultiThread_Concepts;

class Interrupt extends Thread
{
	@Override
	public void run()
	{
		System.out.println(isInterrupted());
		for(int i=1; i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread is interrupted");
				e.printStackTrace();
				break;
			}
		}
	}
}
public class InterruptedThreadDemo02 
{
	public static void main(String[] args)
	{
		Interrupt in = new Interrupt();
		in.start();
		in.interrupt();
		

	}

}
