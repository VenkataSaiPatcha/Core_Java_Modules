package MultiThread_Concepts;

class TatkalTicket implements Runnable
{
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println("Tatkal ticket is booked by ::"+name);
	}
}
class PremiumTatkal01 implements Runnable
{
	@Override
	public void run() 
	{
	String name = Thread.currentThread().getName();
	System.out.println("Premium tatkal is booked by ::"+name);
	}
}
public class ThreadGroupDemo02
{
	public static void main(String[] args) 
	{
		ThreadGroup tatkal =  new ThreadGroup("TatkalTicket");
		ThreadGroup premiumTatkal = new ThreadGroup("Premium-Tatkal");
		
		Thread t1 = new Thread(tatkal, new TatkalTicket(),"A");
		Thread t2 = new Thread(tatkal, new TatkalTicket(),"B");
		Thread t3 = new Thread(tatkal, new TatkalTicket(),"C");
		t1.start();
		t2.start();
		t3.start();
		
		Thread t4 = new Thread(premiumTatkal, new PremiumTatkal01(), "D");
		Thread t5 = new Thread(premiumTatkal, new PremiumTatkal01(), "E");
		Thread t6 = new Thread(premiumTatkal, new PremiumTatkal01(), "F");
		t4.start();
		t5.start();
		t6.start();
		
	}

}
