package MultiThread_Concepts;

class DoStuff extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Current thread name is :"+Thread.currentThread().getName());
	}
}
public class ThreadName 
{
	public static void main(String[] args) 
	{
		DoStuff d1 = new DoStuff();
		DoStuff d2 = new DoStuff();
		d1.start();
		d2.start();
		
		System.out.println(Thread.currentThread().getName()+" thread is running ");
	}

}
