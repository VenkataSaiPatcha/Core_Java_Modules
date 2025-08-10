package Java_Basics_Info;

import java.util.Scanner;

public class SumofValuesIntoSingleNumber 
{
	public static void main(String[] args) 
	{
		int r=0, sum=0, r1=0,sum1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n =sc.nextInt();
		
		while(n!=0)
		{
			 r = n%10;
			 sum += r;
			 n=n/10;
		}
		System.out.println(sum);
		while(sum!=0)
		{
			r1=sum%10;
			sum1 += r1;
			sum=sum/10;
		}
		System.out.println(sum1);
	}
	

}
