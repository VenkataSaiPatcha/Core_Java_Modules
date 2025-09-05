package MultiThread_Concepts;

class Tatkal implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" is booking ticket under tatkal schema");
	}
}
class PremiumTatkal implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" ticket is bokking under premium tatkal schema");
	}
}


public class RunnableInterfaceDemo02 
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread t1 = new Thread(new Tatkal(),"Venkata");
		t1.start();
		Thread t2 = new Thread(new PremiumTatkal(),"Sai");
		
		t2.start();
		
	}

}
