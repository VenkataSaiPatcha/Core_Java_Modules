package MultiThread_Concepts;

class PrintTable
{
	public synchronized void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(num+" x "+i+" = "+(num*i));
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		String name = Thread.currentThread().getName();
		System.out.println(name+"  is completed");
	}
}
public class SychronizationConceptDemo01 
{
	public static void main(String[] args) 
	{
		PrintTable obj1 = new PrintTable(); // lock is created
		PrintTable obj2 = new PrintTable();
		
		Thread t1 = new Thread()
				{
				@Override
				public void run()
				{
					obj1.printTable(5);
				}
				};
		Thread t2 = new Thread()
				{
				@Override
				public void run()
				{
					obj1 .printTable(10);
				}
				};
				
				Thread t3 = new Thread()
						{
					@Override
					public void run()
					{
						obj2.printTable(2);
					}
						};
				Thread t4 = new Thread()
						{
					@Override
					public void run()
					{
						obj2.printTable(4);
					}
						};
						
				t1.start();
				t2.start();
				t3.start();
				t4.start();
	}
}
