package MultiThread_Concepts;

public class AnonymousRunnable 
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable()
				{
				
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				System.out.println(name);
			}
				};
				Thread t1 = new Thread(r1);
				t1.setName("Ananymous_Thread");
				t1.start();
		
	}

}
