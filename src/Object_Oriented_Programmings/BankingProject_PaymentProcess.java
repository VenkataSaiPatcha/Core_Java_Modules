package Object_Oriented_Programmings;

import java.util.Scanner;

class PaymentSection
{
	
	public void makePayment(double amount)
	{
		if(validateAmount(amount))
		{
			System.out.println("Processing payment via cash");
			System.out.println("Amount paid RS :"+amount);
			System.out.println("Payment Successful");
		}
	}
	
	public void makePayment(String cardHolderName,String creditCardNumber,double amount)
	{
		if(validateCardNumber(creditCardNumber) && validateAmount(amount))
		{
			System.out.println("Proccessing payment through Credit card !!");
			System.out.println("Card Holder name :"+cardHolderName);
			System.out.println("Card number :"+  maskCardNumber(creditCardNumber));
			System.out.println("Amount Paid Rs :"+amount);
			System.out.println("Amount paid through card successfully !!");
		}
	}
	public void makePayment(String debitCardNumber, double amount)
	{
		if(validateCardNumber(debitCardNumber) && validateAmount(amount))
		{
			System.out.println("proccessing amount through debit card");
			System.out.println("Debit card number :"+maskCardNumber(debitCardNumber));
			System.out.println("Amount paid RS/- :"+amount);
			System.out.println("Payment successful");
		}
	}
	
	
	// Helper method validate Credit card or Debit card
	private boolean validateCardNumber(String cardNumber)
	{
		if(cardNumber.length() != 16)
		{
			System.err.println("Invalid card number check once again");
			return false;
		}
		return true;
	}
	
	//Helper method
	private String maskCardNumber(String cardNumber)
	{
		return "****-****-****-" + cardNumber.substring(12);
	}
	
	public boolean validateAmount(double amount)
	{
		if(amount<=0)
		{
			System.err.println("Here : amount must be greater than Zero");
			return false;
		}
		return true;
	}
}
public class BankingProject_PaymentProcess 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Payment menu ");
		System.out.println("Select any one payment from the menu :");
		System.out.println("\t\t 1) Payment using Cash");
		System.out.println("\t\t 2) Paymet using Credit Card");
		System.out.println("\t\t 3) Payment using Debit Card");
		
		PaymentSection payment = new PaymentSection();
		
		System.out.println("Enter your payment choice [1/2/3]!!");
		int choice =sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter amount you want to pay through cash");
			double amount=sc.nextDouble();
			payment.makePayment(amount);
			break;
		case 2:
			System.out.println("Enter your name");
			String name=sc.nextLine();
			name  = sc.nextLine();
			System.out.println("Enter your 16 digit credit card number");
			String cardDetails = sc.nextLine();
			System.out.println("Enter your payment amount");
			amount = sc.nextDouble();
			payment.makePayment(name, cardDetails, amount);	
			break;
		case 3:
			System.out.println("Enter your 16 digit card number ");
			String debitCard =sc.nextLine();
			debitCard = sc.nextLine();
			System.out.println("Enter your payment amount :");
			amount = sc.nextDouble();
			payment.makePayment(debitCard, amount);
			break;
			default:System.out.println("Invalid choice try again !!");
		}
		sc.close();
	}

}
