package MultiThread_Concepts;

class MyThreadClass extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child thred is running in separate stack memory");
	}
}
public class CheckingThreadIsAlive 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		MyThreadClass thread = new MyThreadClass();
		System.out.println("Is thread is alive :"+thread.isAlive());
		thread.start();
		//thread.start();  // java.lang.IllegalThreadStateException
		System.out.println("Is thread is alive :"+thread.isAlive());
		System.out.println("Main method ended");
	}

}
