package MultiThread_Concepts;

class ThreadExample
{
	public void exampleOnThread(int num)
	{
		String name = Thread.currentThread().getName();
		System.out.println("Running thread is ::"+name);
		
		synchronized(this)
		{
			try
			{
				
				System.out.println("synchronized block is started");
				for(int i=1;i<=10;i++)
				{
					Thread.sleep(1000);
					System.out.println(num+" X "+i+" = "+(num*i));
				}
				
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			
			System.out.println("synchronized block is ended");
		}
	}
}

public class BlockLevelSynchronizationDemo02
{
	public static void main(String[] args) 
	{
		ThreadExample ex = new ThreadExample(); // lock
		
		Runnable r1 = ()->ex.exampleOnThread(10);
		Runnable r2 = ()-> ex.exampleOnThread(5);
		
		Thread t1 = new Thread(r1,"First-Thread");
		Thread t2 = new Thread(r2,"Secound-Thread");
		
		t1.start();
		t2.start();
		
	}

}
