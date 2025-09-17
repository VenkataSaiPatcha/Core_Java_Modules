package MultiThread_Concepts;

class CustomerClass extends Thread
{
	private double balance;
	
	public CustomerClass( double balance)
	{
		this.balance = balance;
	}
	
	public synchronized void withdraw(double amount)
	{
		System.out.println("Son is going to withdraw the money");
		if(amount>this.balance)
		{
			System.out.println("balance amount is less wait some time !!");
			try
			{
				wait();  // lock is released
				System.out.println("Got notification from withdraw");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.balance = this.balance-amount;
		System.out.println("After withrawing remaining balance is ::"+this.balance);
	}
	public synchronized void  deposit(double amount)
	{
		System.out.println("Going to deposit the amount");
		this.balance = balance+amount;
		System.out.println("amount is added sucessful to balance, then balance is :: "+this.balance);
		
		notify();
	}
}
public class InterThreadCommunicationDemo04 {

	public static void main(String[] args) 
	{
	System.out.println("Main method started");	
		CustomerClass c1 = new CustomerClass(45000.0);
		
		Runnable r1 = ()->c1.withdraw(50000.0);
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = ()->c1.deposit(10000.0);
		Thread t2 = new Thread(r2);
		t2.start();
		System.out.println("Main method ended");
	}

}
