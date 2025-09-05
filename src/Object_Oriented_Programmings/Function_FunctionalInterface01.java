package Object_Oriented_Programmings;

import java.util.Scanner;
import java.util.function.Function;

public class Function_FunctionalInterface01
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> f1 = num->num*num*num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value :");
		int no=sc.nextInt();
		System.out.println("Cube of number is :"+f1.apply(no));	
		sc.close();
		
	}
}