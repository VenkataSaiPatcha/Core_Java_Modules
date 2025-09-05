package MultiThread_Concepts;

class SuperClass extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" value :"+name);
		try
		{
			Thread.sleep(1000); 

		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		}
		
	}
}
class SubClass extends Thread
{
	@Override
	public void run()
	{
		SuperClass s1 = new SuperClass();
		s1.setName("Super_Class_Thread");
		s1.start();
		try {
			s1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name = Thread.currentThread().getName();
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" value by :"+name);
		}
	}
}



public class JoinDemo04 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		SubClass s1 = new SubClass();
		s1.setName("Sub_Class_Thread");
		s1.start();
		System.out.println("Main method ended");
	}

}
