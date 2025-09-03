package MultiThread_Concepts;

public class AnonymousThreadWithoutReference
{
	public static void main(String[] args) 
	{
		 new Thread()
				{
			@Override
			public void run()
			{
				System.out.println(Thread.currentThread().getName()+" thread is running inside the anonymus inner class");
			}
				}.start();
		
	}

}
