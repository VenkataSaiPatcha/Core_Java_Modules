package ExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourses 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter your salary");
			double salary =sc.nextInt();
			System.out.println("salary is :"+salary);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input is invalid");
		}
		
	}

}
