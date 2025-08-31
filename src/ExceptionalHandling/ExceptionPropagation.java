package ExceptionalHandling;

public class ExceptionPropagation 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		try
		{
			m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is handled");
			
		}
		System.out.println("Main method ended");
	}
	public static void m1()
	{
		m2();
		System.out.println("M1 method");
	}
	public static void m2()
	{
		throw new ArithmeticException();
	}
}
