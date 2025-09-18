package MultiThread_Concepts;

class Resources
{
	private boolean flag = false;
	
	public synchronized void waitMethod()
	{
		System.out.println("Waiting ");
		while(!flag)
		{
			try {
				System.out.println(Thread.currentThread().getName()+"  is waiting...");
				System.out.println(Thread.currentThread().getName()+" is waiting for notification");
				wait();
				
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" thread is completed");
	}
	public synchronized void notifyMethod()
	{
		System.out.println("notifyAll");
		this.flag = true;
		System.out.println(Thread.currentThread().getName()+" has making flag value as a true ");
		notifyAll();   // Notify all waiting thread in a single thread
		
	}
}

public class NotifyAllMethodDemo01 
{
	public static void main(String[] args) 
	{
		Resources r1 = new Resources(); 		// lock is created
		Thread t1 = new Thread(()->r1.waitMethod(),"child-1");
		Thread t2 = new Thread(()->r1.waitMethod(),"child-2");
		Thread t3 = new Thread(()->r1.waitMethod(),"child-3");
		t1.start();
		t2.start();
		t3.start();
			
		Thread setter = new Thread(() -> r1.notifyMethod(),"Setter_Thread");
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		setter.start();
	}

}
