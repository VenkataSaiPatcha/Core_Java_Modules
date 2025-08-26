package ExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpecificException
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter x value");
			int x = sc.nextInt();
			System.out.println("x value is :"+x);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		sc.close();
		System.out.println("Main method ended");
		
	}

}
