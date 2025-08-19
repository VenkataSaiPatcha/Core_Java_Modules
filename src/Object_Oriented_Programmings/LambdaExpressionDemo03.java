package Object_Oriented_Programmings;

import java.util.Scanner;

@FunctionalInterface
interface Calculations
{
	double doSUm(double a, double b);
}
public class LambdaExpressionDemo03 
{
	public static void main(String[] args) 
	{
		Calculations c1 = (a,b)-> a+b;  // return 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		double a1=sc.nextDouble();
		System.out.println("Enter b value:");
		double b1=sc.nextDouble();
		
		  System.out.println(c1.doSUm(a1, b1)); 
	}

}
