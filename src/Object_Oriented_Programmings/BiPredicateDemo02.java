package Object_Oriented_Programmings;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class BiPredicateDemo02
{
	public static void main(String[] args) 
	{
		BiPredicate<Integer, Integer> b1 = (a,b) -> (a+b)%2==0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b =sc.nextInt();
		sc.close();
		boolean result =b1.test(a, b);
		System.out.println("Is "+a+" and "+b+" sum is even ?"+result);
	}

}
