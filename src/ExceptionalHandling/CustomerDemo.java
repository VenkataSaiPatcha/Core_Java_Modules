package ExceptionalHandling;

import java.util.Scanner;

public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome client, welcome to my application");
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("start of try block");
			System.out.println("Enter x value");
			int x = sc.nextInt();
			System.out.println("Enter y value");
			int y = sc.nextInt();
			int result = x/y;
			System.out.println("Result is :"+result);
			System.out.println("End of try block");
		}
		catch(Exception e)
		{
			System.err.println("Sir,please don't put 0 here !!! ");
			System.out.println(e);
		}
		System.out.println("Thank you client, have a nice day !!!");
		sc.close();
	}

}
