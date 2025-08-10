package Java_Basics_Info;

import java.util.Scanner;

public class PrintingMultiplePrimes 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int num=sc.nextInt();
		
		if(num<=1)
		{
			System.out.println("Invalid value !!");
			return;
		}
		for(int i=2;i<=num;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+" ");
			}
		}
		sc.close();
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		for(int j=2;j<=Math.sqrt(n);j++)
		{
			if(n%j==0)
				return false;
			
		}
		return true;
	}
}
