package Object_Oriented_Programmings;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo
{
	public static void main(String[] args) 
	{
		UnaryOperator<Integer> u1 = (a)->
		{
			return a*a;
		};
		System.out.println("Return value is :"+u1.apply(10));
		System.out.println("----------------------------");
		UnaryOperator<String> u2 = str->str.concat("World");
		System.out.println("Result :"+u2.apply("Hello "));
		
		
	}

}
