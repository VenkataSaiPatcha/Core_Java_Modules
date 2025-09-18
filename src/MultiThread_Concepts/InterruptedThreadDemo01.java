package MultiThread_Concepts;

public class InterruptedThreadDemo01 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(()->
		{
				try
				{
				System.out.println("Thread is going to sleep.....");
				Thread.sleep(5000);
				System.out.println("Thread  woke up normally");
				}
				catch(InterruptedException e)
				{
					System.out.println("Thread was interrupted during sleeping ");
				}
		});
		t1.start();
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	//	t1.interrupt();
	}
	

}
