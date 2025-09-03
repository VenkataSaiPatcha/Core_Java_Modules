package MultiThread_Concepts;

public class AnonymousThreadWithReference 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
				{
			@Override
				public void run()
				{
				String name = Thread.currentThread().getName();
					System.out.println(name+" thread is running inside the ananomous class");
				}
				};
				t1.start();
			System.out.println(Thread.currentThread().getName()
					+" thread is running");
		
	}

}
