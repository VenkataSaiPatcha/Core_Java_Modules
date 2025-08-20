package Object_Oriented_Programmings;

import java.util.function.BiPredicate;

public class BiPredicateDemo01
{
	public static void main(String[] args) 
	{
		BiPredicate<String,Integer> b1 = (x,y)->
		{
			return x.length()==y;
		};
			boolean result=b1.test("Sai", 3);
			System.out.println("Is both length is same :"+result);
			result = b1.test("Hyderabad", 10);
			System.out.println("Is both length is same :"+result);
		
	}
}
