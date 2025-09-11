package MultiThread_Concepts;

class PrintTableClass
{
	public static synchronized void printTable(int num)
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
		System.out.println("--------------------------");
	}
}

public class StaticSynchronizationDemo01 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
				{
			public void run()
			{
				PrintTableClass.printTable(10);
			}
				};
				Thread t2 = new Thread()
						{
					public void run()
					{
						PrintTableClass.printTable(5);
					}
						};
						Runnable r1 = ()-> PrintTableClass.printTable(7);
						Thread t3 = new Thread(r1);
						t1.start();
						t2.start();
						t3.start();
	}

}
