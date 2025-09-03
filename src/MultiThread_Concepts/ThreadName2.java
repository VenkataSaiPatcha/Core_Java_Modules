package MultiThread_Concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

class BatchAssignment extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		if(name!=null && name.equalsIgnoreCase("Placement"))
		{
			this.placement();
		}
		else if(name!=null && name.equalsIgnoreCase("Regular"))
		{
			this.regular();
		}
		else
		{
			throw new InputMismatchException("Invalid input");
		}
	}
	public void placement()
	{
		System.out.println("I'am a placement batch student");
	}
	public void regular()
	{
		System.out.println("I'am a regular batch student");
	}
}
public class ThreadName2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			System.out.println("Enter the batch title ::");
			String title = sc.nextLine();
			
			BatchAssignment batch = new BatchAssignment();
			batch.setName(title);
			batch.start();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input value");
		}
		
		
	}

}
