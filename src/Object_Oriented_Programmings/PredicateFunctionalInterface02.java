package Object_Oriented_Programmings;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateFunctionalInterface02 
{
	public static void main(String[] args) 
	{
		Predicate<String> p1 = str->str.startsWith("A");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.next();
		
		System.out.println("Is the "+name+" start with A or not :"+p1.test(name));
		sc.close();
	}

}
