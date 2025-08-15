package Object_Oriented_Programmings;

class Payment
{
	public double makePayment(double amount)
	{
		return amount;
	}
}
class UPI extends Payment
{
	@Override
	public double makePayment(double amount) 
	{
		System.out.println("making payment "+amount+" through UPI ");
		return amount;
	}
	public void offer()
	{
		System.out.println("Making first payment win 100 rs chas :");
	}
}
class CreditCard extends Payment
{
	@Override
	public double makePayment(double amount)
	{
		System.out.println("Making payment amount "+amount+" through CreditCard ");
		return amount;
	}
	public void offer()
	{
		System.out.println("Make payment through Credit card to get 200 cashback");
	}
}
public class InstanceOfDemo6 
{
	public static void main(String[] args) 
	{
		Payment p = null;
		p=new UPI();
		acceptPayment(p);
		System.out.println("-----------------");
		p = new CreditCard();
		acceptPayment(p);
		
	}
	public static void acceptPayment(Payment payment)
	{
		if(payment instanceof UPI)
		{
			UPI u = (UPI)payment;
			u.makePayment(2000.0);
			u.offer();
		}
		else
		{
			CreditCard c = (CreditCard)payment;
			c.makePayment(1000.0);
			c.offer();
		}
	}

}
