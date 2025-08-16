package Array_Concepts;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value :");
		int i=sc.nextInt();
		Demo d1 = new Demo();
		d1.isPowerOf(i);
		if(d1.isPowerOf(i))
		{
			System.out.println(i+" is a power of 2");
		}
		else
		{
			System.out.println(i+" is a not power of 2");
		}
		
		
	}
	public  boolean isPowerOf(int n)
	{
		if(n<=0)
		{
			return false;
		}
		else {
			double logValue=Math.log(n)/Math.log(2);
			if(logValue==(int) logValue)
			{
				return true;
			}
		}
		return false;
	}
}
