package Object_Oriented_Programmings;

@FunctionalInterface
 interface DoPayment
{
	void makePayment(); //public+abstract
}
public class AnonymousWithFunctionalInterface
{
	public static void main(String[] args) 
	{
		DoPayment UPI = new DoPayment()
		{
			
			@Override
			public void makePayment() 
			{
			System.out.println("Making payment through UPI");	
			}
		};
		DoPayment creditCard = new DoPayment() {
			
			@Override
			public void makePayment() 
			{
			System.out.println("Make payment with credit card");	
			}
		};
		UPI.makePayment(); creditCard.makePayment();
	}

}
