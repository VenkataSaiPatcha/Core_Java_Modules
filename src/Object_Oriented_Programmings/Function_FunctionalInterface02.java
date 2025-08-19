package Object_Oriented_Programmings;

import java.util.Scanner;
import java.util.function.Function;

public class Function_FunctionalInterface02 
{
	public static void main(String[] args) 
	{
		Function<String,Integer> f1 = str->str.length();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.next();
		
		System.out.println(name+" length is :"+f1.apply(name));
		
	}

}
