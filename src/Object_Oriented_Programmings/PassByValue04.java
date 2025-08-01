package Object_Oriented_Programmings;
class Customer01
{
	private double customerBill=12000;

	public double getCustomerBill() {
		return customerBill;
	}

	public void setCustomerBill(double customerBill) {
		this.customerBill = customerBill;
	}
	
}
public class PassByValue04 
{
	public static void main(String[] args) 
	{
		Customer01 c1 = new Customer01();
		accept(c1);
		System.out.println(c1.getCustomerBill());
	}
	public static void accept(Customer01 cust)
	{
		cust =new Customer01();
		cust.setCustomerBill(18000.0);
		
	}
}
