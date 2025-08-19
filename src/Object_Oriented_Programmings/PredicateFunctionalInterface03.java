package Object_Oriented_Programmings;
import java.util.Scanner;
import java.util.function.Predicate;
public class PredicateFunctionalInterface03
{
	public static void main(String[] args) 
	{
		/*Predicate<Integer> p1 = age->
		{
			if(age<18)
			return false;
			else if(age>18)
				return true;
			else
			return false;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("is "+age+" is eligible to vote :"+p1.test(age)); */
		
		
		Predicate<Integer> p1 = age-> age>=18;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		boolean isEligible = p1.test(age);
		if(isEligible)
		{
			System.out.println(age+" person is eligible");
		}
		else
		{
			System.out.println(age+" person is not eligible");
		}
		
	}

}
