package MultiThread_Concepts;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child thread is runnign");
	}
}
public class UserThread 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		
		MyThread m1 = new MyThread();
		m1.start();
		
		System.out.println("Main method ended");
	}

}
