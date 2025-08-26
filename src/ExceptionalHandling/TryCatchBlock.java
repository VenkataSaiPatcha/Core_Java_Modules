package ExceptionalHandling;

import java.util.Scanner;

public class TryCatchBlock 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("try block started");
			System.out.println("Enter x value ");
			int x = sc.nextInt();
			System.out.println("Enter y value");
			int y = sc.nextInt();
			int result = x/y;
			System.out.println("Result is :"+result);
			System.out.println("End of try block");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
			System.out.println(e);
		}
		System.out.println("Main method ended");
		sc.close();
		
	}

}
