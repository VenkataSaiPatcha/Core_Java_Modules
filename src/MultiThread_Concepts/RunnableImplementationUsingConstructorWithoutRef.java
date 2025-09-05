package MultiThread_Concepts;

public class RunnableImplementationUsingConstructorWithoutRef 
{
	public static void main(String[] args) 
	{
		new Thread(
				new Runnable()
				{
					public void run()
					{
						String name = Thread.currentThread().getName();
						System.out.println(name);
					}
				}
				).start();
		
	}

}
