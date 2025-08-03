package Object_Oriented_Programmings;

class Father01
{
	protected double balance = 20000.0;
}
class Daughter extends Father01
{
	protected double balance = 50000.0; // Variable Hiding
	
	public void getBalance()
	{
		System.out.println("Daughter balance amount is :"+this.balance);
		System.out.println("Father balance amount is :"+super.balance);
	}
}
public class VariableHiding {

	public static void main(String[] args)
	{
		Daughter d1 = new Daughter();
		d1.getBalance();
		
		

	}

}
