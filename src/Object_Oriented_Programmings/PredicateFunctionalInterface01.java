package Object_Oriented_Programmings;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateFunctionalInterface01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		Predicate<Integer> p1 = num->num%2==0;
		
		System.out.println("Is "+n+" is an even ?:"+p1.test(n));
		sc.close();
	}

}
