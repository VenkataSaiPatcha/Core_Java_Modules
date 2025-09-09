package MultiThread_Concepts;


class ThreadNameClass
{
	public void printThreadName()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Running thread name is ::"+name);
		
		synchronized (this) 
		{
			System.out.println("Synchronized block is started by thread ::"+name);
			for(int i=1;i<=10;i++)
			{
				
				System.out.println("i value is :"+i+" by name :"+name);
			}
			System.out.println("Synchronized block is ended by thread ::"+name);
		}
	}
	
}
public class BlockLevelSynchronization {

	public static void main(String[] args) 
	{
		ThreadNameClass t1 = new ThreadNameClass(); // lock is created
		
		Runnable r1 = ()->t1.printThreadName();
		
		Thread thread1 = new Thread(r1,"child-1");
		Thread thread2 = new Thread(r1,"child-2");
		
		thread1.start();
		thread2.start();
		
			
	}

}
