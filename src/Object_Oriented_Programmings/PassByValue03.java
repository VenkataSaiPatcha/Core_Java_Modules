package Object_Oriented_Programmings;
//Java is always pass-by-value, but:
//When passing primitive types, it passes the actual value.
class Customer
{
	private double customerBill = 12000;
	
	public double getCustomerBill()
	{
		return customerBill;
	}
	public void setCustomerBill(double customerBill)
	{
		this.customerBill=customerBill;
	}
}
public class PassByValue03 
{

	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		accept(c1);
		System.out.println(c1.getCustomerBill()); 
		
	}
	public static void accept(Customer cust)
	{
		cust.setCustomerBill(18000.0);
	}
}
