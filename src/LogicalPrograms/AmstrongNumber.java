package LogicalPrograms;

import java.util.Scanner;

public class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int num =sc.nextInt();
		AmstrongNumber a1 = new AmstrongNumber();
			int value = a1.isAmstrongNumber(num);
			System.out.println("value :"+value);
			if(value==num)
			{
				System.out.println("Amstrong number");
			}
			else
			{
				System.out.println("Not an amstrong");
			}
	}
	public int isAmstrongNumber(int n)
	{
		int x = n;
		int sum = 0,r=0;
		if(x<=0)
			return 0;
		int power = String.valueOf(x).length();
		while(x!=0)
		{
			r=x%10;
			sum=sum+(int)Math.pow(r, power);
		
		x = x/10;
		}
		return sum;
		
	}

}
