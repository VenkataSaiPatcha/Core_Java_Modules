package MultiThread_Concepts;

class Demo01 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Thread is running");
	}
}
public class RunnableInterfaceDemo01 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		Demo01 d1 = new Demo01();
		Thread t1 = new Thread(d1);
		t1.start();
		System.out.println("Main ended");
	}

}
