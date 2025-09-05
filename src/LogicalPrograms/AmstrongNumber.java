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
			System.out.println(a1.isAmstrongNumber(num));
	}
	public int isAmstrongNumber(int n)
	{
		int x = n;
		System.out.println(x);
		System.out.println(n);
		int sum = 0;
		if(x<=0)
			return 0;
		int power = String.valueOf(x).length();
		System.out.println(power);
		while(x!=0)
		{
		sum=(int) (sum*10+Math.pow(x%10, power));
		
		x = x/10;
		}
		if(n==sum)
//			System.out.println(n);
//		System.out.println(sum);
			return sum;
		return power;
		
	}

}
