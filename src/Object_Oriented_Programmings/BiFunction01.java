package Object_Oriented_Programmings;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunction01 
{
	public static void main(String[] args) 
	{
		BiFunction<String,String, String> function = (str1,str2)->str1+str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter st1 :");
		String s1 =sc.next();
		System.out.println("Enter str2 :");
		String s2 =sc.next();
		String s3=function.apply(s1, s2);
		System.out.println(s3);
		System.out.println("----------------------------------------------");
		
		BiFunction<String, String, Integer> function2 = (str1,str2)->str1.length()+str2.length();
		System.out.println("Enter str1 :");
		String ss1 =sc.next();
		System.out.println("Enter str2 :");
		String ss2 =sc.next();
		
		Integer result =function2.apply(ss1, ss2);
		System.out.println(result);
	}

}
