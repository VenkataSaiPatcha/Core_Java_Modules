package MultiThread_Concepts;

public class JoinDemo03 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main method started");
		Thread t = Thread.currentThread();
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i+" by "+t.getName());
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		t.join();
		System.out.println("Main method ended");
		
	}

}
