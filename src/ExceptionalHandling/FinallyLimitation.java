package ExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyLimitation 
{
	public static void main(String[] args) 
	{
		Scanner sc = null;
		try
		{
			sc = new Scanner(System.in);
			System.out.println("Enter age ");
			int age =sc.nextInt();
			System.out.println("Age is :"+age);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("final block");
			sc.close();
		}
	}

}
