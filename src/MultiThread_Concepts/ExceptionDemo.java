package MultiThread_Concepts;

class Stuff extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" thread is running");
	}
}
public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		String name=Thread.currentThread().getName();
		System.out.println(name+" thread is running");
		
		Stuff t1 = new Stuff();
		Stuff t2 = new Stuff();
		System.out.println("Is :"+t1.getName()+" thread is started :"+t1.isAlive());
		System.out.println("Is :"+t2.getName()+" thread is started :"+t2.isAlive());
		
		t1.start();
		t2.start();
		System.out.println("Is :"+t1.getName()+" thread is started :"+t1.isAlive());
		System.out.println("Is :"+t2.getName()+" thread is started :"+t2.isAlive());
		
		
		System.out.println("Main method ended");
	}

}
