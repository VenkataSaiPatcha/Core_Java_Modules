package ExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchInsideCatch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter your roll no :");
			int roll = sc.nextInt();
			System.out.println("Roll no is :"+roll);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Invalid input value");
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e1)
			{
				System.err.println("Number Divide by zero");
			}
		}
		finally
		{
			try
			{
				throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.err.println("Array index out of bounds");
			}
			
		}
	}

}
