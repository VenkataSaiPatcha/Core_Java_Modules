package MultiThread_Concepts;

class Customer 
{
	private double availableBalance = 50000.0;
	private double withDrawBalance;
	
	public Customer(double withDrawBalance)
	{
		this.withDrawBalance=withDrawBalance;
	}
	
	public void withdraw()
	{
		String name = null;
		
		if(availableBalance>=withDrawBalance)
		{
			name = Thread.currentThread().getName();
			System.out.println(withDrawBalance+" amount was sucessfully withdraw by "+name);
			availableBalance = availableBalance-withDrawBalance;
			System.out.println("Remaining amount is ::"+availableBalance);
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry "+name+" insufficient balance");
		}
	}
}


public class MultipleThreadBankApplication 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer(25000);
		Runnable r1 = ()->c1.withdraw();
		
		Thread t1 = new Thread(r1,"Sai");
		Thread t2 = new Thread(r1,"Mahesh");
		
		t1.start();
		t2.start();
	}

}
