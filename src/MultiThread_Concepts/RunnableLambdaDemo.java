package MultiThread_Concepts;

public class RunnableLambdaDemo
{
	public static void main(String[] args) 
	{
		Runnable r1 = 
			()->
			{
				String name = Thread.currentThread().getName();
				System.out.println("current thread name is :"+name);
			};
		Thread t1 = new Thread(r1);
		//t1.start();
		r1.run();
	}

}
