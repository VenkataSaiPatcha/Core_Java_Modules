package MultiThread_Concepts;

public class LambdaImplementationInConstructor 
{
	public static void main(String[] args) 
	{
			new Thread(
				()->System.out.println(Thread.currentThread().getName())
				).start();
		Thread t1 = new Thread(
				()->
				{
					String name = Thread.currentThread().getName();
					System.out.println(name);
				}
				);
		t1.start();
	}

}
