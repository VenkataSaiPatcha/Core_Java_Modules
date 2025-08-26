package ExceptionalHandling;

public class ExceptionFormat 
{
	public static void main(String[] args) 
	{
		ArithmeticException exception = new ArithmeticException("Divide the number by zero");
		System.out.println(exception.toString());
		
	}

}
