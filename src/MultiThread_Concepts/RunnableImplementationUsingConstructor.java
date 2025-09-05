package MultiThread_Concepts;

public class RunnableImplementationUsingConstructor 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Runnable()
				 {
			@Override
			public void run()
			{
				String name  = Thread.currentThread().getName();
				System.out.println(name);
			}
				 }
				
				);
		t1.setName("Main_Thread");
		t1.start();
		
	}

}
