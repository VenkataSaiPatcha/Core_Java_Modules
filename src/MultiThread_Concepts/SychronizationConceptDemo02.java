package MultiThread_Concepts;


class PrintTables
{
	public synchronized void printTables(int num)
	{
		try
		{
			String name = Thread.currentThread().getName();
			System.out.println("Current running thread ::"+name);
			
			for(int i=1;i<=10;i++)
			{
				Thread.sleep(1000);
				System.out.println(num+" X "+i+" = "+(num*i));
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class SychronizationConceptDemo02 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		PrintTables p1 = new PrintTables();
		
		Runnable r1 = ()->p1.printTables(2);
		Runnable r2 = ()->p1.printTables(4);
		
		Thread t1 = new Thread(r1,"Thread-1");
		Thread t2 = new Thread(r2,"Thread-2");
		
		t1.start();
		t2.start();
		System.out.println("Main method ended");
	}

}
