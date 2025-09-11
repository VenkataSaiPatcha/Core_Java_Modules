package MultiThread_Concepts;

class Test implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<=10;i++)
		{
			System.out.println(" i value is :"+i+" by name :"+name);
			if(name.equals("child - 1"))
			{
				Thread.yield();
			}
		}
	}
}
public class YieldMethodDemo 
{
	public static void main(String[] args) 
	{
		Test test = new Test();
		
		Thread t1 = new Thread(test,"child - 1");
		Thread t2 = new Thread(test,"child - 2");
		
		t1.start();
		t2.start();
		
		
		
	}

}
