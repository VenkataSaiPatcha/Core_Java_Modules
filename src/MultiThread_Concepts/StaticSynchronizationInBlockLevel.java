package MultiThread_Concepts;

class PrintNumbersOfTables
{
	public static void printTables(int num)
	{
		synchronized(PrintNumbersOfTables.class)
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
			System.out.println("----------------------");
		}
		
	}
}

public class StaticSynchronizationInBlockLevel 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
				{
			@Override
			public void run()
			{
				PrintNumbersOfTables.printTables(10);
			}
				};
				Thread t2 = new Thread()
						{
					@Override
					public void run()
					{
						PrintNumbersOfTables.printTables(5);
					}
						};
						
						Runnable r1 = ()->PrintNumbersOfTables.printTables(2);
						Thread t3 = new Thread(r1);
						Runnable r2 = ()->PrintNumbersOfTables.printTables(4);
						Thread t4 = new Thread(r2);
						
						t1.start();
						t2.start();
						t3.start();
						t4.start();
		
	}

}
