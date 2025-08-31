package ExceptionalHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{
		
	}
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
public class CustomCheckedException
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter your age");
			int age = sc.nextInt();
				isValid(age);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void isValid(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Invalid age");
		}
		else
		{
			System.out.println("You are allowed to movie");
		}
	}
}
