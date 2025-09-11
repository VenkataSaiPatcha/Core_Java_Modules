package MultiThread_Concepts;

class TablesClass
{
	public synchronized void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				System.out.println(num+" X "+i+" = "+(num*i));
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("--------------------------------");
	}
}

public class SynchronizationDemo03 
{
	public static void main(String[] args) 
	{
		TablesClass t1 = new TablesClass();
		TablesClass t2 = new TablesClass();
		Runnable r1 = ()-> t1.printTable(10);
		Runnable r2 = ()-> t1.printTable(5);
		Runnable r3 = ()-> t2.printTable(2);
		Runnable r4 = ()-> t2.printTable(4);
		
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		Thread thread3 = new Thread(r3);
		Thread thread4 = new Thread(r4);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
