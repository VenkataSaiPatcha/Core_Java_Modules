package Object_Oriented_Programmings;

import java.util.Scanner;
import java.util.function.Function;

public class Function_FunctionalInterface03 
{
	public static void main(String[] args) 
	{
		Function<String,Boolean> f1 = str->str.startsWith("V");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.next();
		
		System.out.println("Is "+name+" starts with V ?:"+f1.apply(name));
		sc.close();
	}

}
