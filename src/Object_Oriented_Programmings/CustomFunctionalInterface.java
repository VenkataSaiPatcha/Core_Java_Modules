package Object_Oriented_Programmings;

import java.util.Scanner;

@FunctionalInterface
interface TriFunction<T,U,V,R>
{
	public abstract R spend(T x, U y, V Z);
}
public class CustomFunctionalInterface
{
	public static void main(String[] args) 
	{
		TriFunction<Integer,Integer,Integer,String> t1 = (a,b,c)-> " "+a+b+c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a=sc.nextInt();
		System.out.println("Enter b value :");
		int b=sc.nextInt();
		System.out.println("Enter c value :");
		int c=sc.nextInt();
		sc.close();
		System.out.println("Custom Functional interface :"+t1.spend(a, b, c));
		
	}

}
