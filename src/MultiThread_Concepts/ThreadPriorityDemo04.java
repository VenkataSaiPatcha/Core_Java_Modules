package MultiThread_Concepts;

class Priority extends Thread
{
	public void run()
	{
		int count=0;
		for(int i=1;i<=1000000;i++)
		{
			count++;
		}
		int priority = Thread.currentThread().getPriority();
		String name = Thread.currentThread().getName();
		System.out.println("The priority is ::"+priority+" and thread name is :"+name);
	}
	
}

public class ThreadPriorityDemo04
{
	public static void main(String[] args) 
	{
		Priority p1 = new Priority();
		Priority p2 = new Priority();
		
//		p1.setPriority(Thread.MIN_PRIORITY);
//		p2.setPriority(Thread.MAX_PRIORITY);
		
//		p1.setName("Last");
//		p2.setName("First");
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.setName("Last");
		t2.setName("First");
		
		t1.start();
		t2.start();
		
		
	}

}
