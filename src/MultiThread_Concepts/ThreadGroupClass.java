package MultiThread_Concepts;

class MyThread01 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Current Thread name is :"+Thread.currentThread().getName());
	}
}
public class ThreadGroupClass
{
	public static void main(String[] args) 
	{
		ThreadGroup group  = new ThreadGroup("MyGroup");
		
		Thread t1 = new Thread(group,new MyThread01(),"Child_Thread-1");
		Thread t2 = new Thread(group,new MyThread01(),"Child_Thread-2");
		
		t1.start();
		t2.start();
		
		System.out.println("Thread Group name is :"+group.getName());
		group.list();
	}

}
