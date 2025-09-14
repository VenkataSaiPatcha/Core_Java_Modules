package MultiThread_Concepts;

class ITC01 extends Thread
{
	private int val  = 0;
	@Override
	public void run()
	{
		// child thread wait for object lock
		synchronized(this)
		{
			try
			{
				
				for(int i=1;i<=10;i++)
				{
					val = val+i;
					Thread.sleep(1000);
					System.out.println(val);
				}
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("sending notification to main thread");
			notify();
		}
	}
	public int getFinalValue()
	{
		return val;
	}
}
public class InterThreadCommunicationDemo03
{
	public static void main(String[] args) throws InterruptedException
	{
		ITC01 it = new ITC01();
		
		it.start();
//		Thread.yield();
//		Thread.sleep(1000); these two are used to give a chance to child thread first priority
		
		synchronized (it) 
		{
			System.out.println("Waiting for child thread to complete");
			System.out.println("Lock is released");
			it.wait();
			
			System.out.println("Main thread wake up");
			System.out.println(it.getFinalValue());
			
		}
		
	}

}
