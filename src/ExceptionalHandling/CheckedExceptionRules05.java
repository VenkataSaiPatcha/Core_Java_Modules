package ExceptionalHandling;

import LogicalPrograms.Main;

public class CheckedExceptionRules05 
{
	{
		try
	{
		throw new ArithmeticException();
	}
	catch(ArithmeticException e)
	{
		System.out.println("Normal termination");
	}
}
	
	public static void main(String[] args) 
	{
		new CheckedExceptionRules05();
		System.out.println("Main");
		
	}

}
