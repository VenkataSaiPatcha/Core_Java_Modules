package Object_Oriented_Programmings;

import java.util.Scanner;

interface Verifier
{
	boolean isEven(int num);
}
public class LambdaExpressionDemo04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		Verifier v1 = num-> num%2==0;
//		{
//			return num%2==0;             
//		};
		System.out.println("is "+no+" is even ?:"+v1.isEven(no));
	}

}
