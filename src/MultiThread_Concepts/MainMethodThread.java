package MultiThread_Concepts;

public class MainMethodThread
{
	public static void main(String[] args) 
	{
		Thread thread=Thread.currentThread();
		System.out.println("Current thread name is : "+thread.getName());
	}

}
