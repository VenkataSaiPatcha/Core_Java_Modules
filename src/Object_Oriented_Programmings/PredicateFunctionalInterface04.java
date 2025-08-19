package Object_Oriented_Programmings;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateFunctionalInterface04 
{
	public static void main(String[] args) 
	{
		Predicate<String> p1 = name -> name.equalsIgnoreCase("Sai");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("my name is  sai or not :"+p1.test(name));
		
		
	}

}
