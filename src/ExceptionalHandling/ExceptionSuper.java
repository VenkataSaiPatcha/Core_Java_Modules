package ExceptionalHandling;

import java.util.InputMismatchException;

public class ExceptionSuper 
{
	public static void main(String[] args) 
	{
		Exception e = new Exception();
		System.out.println(e.toString());
		
		e = new ArithmeticException();
		System.out.println(e.toString());
		
		e = new ArrayIndexOutOfBoundsException();
		System.out.println(e.toString());
		
		e = new StringIndexOutOfBoundsException();
		System.out.println(e.toString());
		
		e = new NullPointerException();
		System.out.println(e.toString());
		
		e = new InputMismatchException();
		System.out.println(e.toString());
		
		e = new NegativeArraySizeException();
		System.out.println(e.toString());
		
		e = new NumberFormatException();
		System.out.println(e.toString());
	}

}
