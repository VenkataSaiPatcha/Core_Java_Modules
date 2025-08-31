package ExceptionalHandling;

import java.util.Scanner;

@SuppressWarnings("serial")
class GreaterMarksException extends RuntimeException
{
	public GreaterMarksException()
	{
		
	}
	public GreaterMarksException(String errorMessage)
	{
		super(errorMessage);
	}
}

public class CustomUnCheckedException 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter your marks");
			int marks = sc.nextInt();
			validatingMarks(marks);
		}
		catch(GreaterMarksException e )
		{
			System.out.println(e.getMessage());
			
		}	
	}
	public static void validatingMarks(int marks)
	{
		if(marks<35)
		{
			throw new GreaterMarksException(" Work hard !!! ");
		}
		else
		{
			System.out.println("You are pass ");
		}
	}

}
