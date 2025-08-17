package Object_Oriented_Programmings;

interface Bank
{
	void deposit(double amount);
	void withDraw(double amount);
}
class BankCustomer implements Bank
{
	protected double balance; 
	@Override
	public void deposit(double amount)
	{
		System.out.println("Initial value of Balance :"+balance);
		if(amount<=0)
		{
			System.out.println("amount is not more the 0");
		}
		
		else
		{
			this.balance = balance+amount;
			System.out.println("amount is deposit into account :"+balance);
		}
	}
	@Override
	public void withDraw(double amount)
	{
		if(amount>this.balance)
		{
			System.out.println("sorry balance amount is not sufficient than the amount");
		}
		else
		{
			this.balance = this.balance-amount;
			System.out.println(balance+" Remaining balance amount ");
		}
	}
}
public class InterfaceDemo02
{
	public static void main(String[] args) 
	{
		BankCustomer bank = new BankCustomer();
		bank.deposit(10000);
		bank.withDraw(5000);
	}

}
