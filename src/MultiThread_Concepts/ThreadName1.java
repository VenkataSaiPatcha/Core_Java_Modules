package MultiThread_Concepts;

class Demo extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" thread is running");
	}
}
public class ThreadName1 
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		d1.setName("child-1");
		d2.setName("child-2");
		d1.start();
		d2.start();
	
		Thread name =Thread.currentThread();
		name.setName("Parent");
		System.out.println(name.getName()+" thread is runnning");
		
	}

}
