package Java_Basics_Info;
import java.lang.Integer;
public class InstanceOf_Operator 
{
	public static void main(String[] args) 
	{
	
		String str = "Venkata_Sai";
		if(str instanceof String)
		{
			System.out.println("str is pointing to string object");
		}
		
		Integer i = 10;
		if(i instanceof Integer)
		{
			System.out.println("i is pointing to Integer object");
		}
		Double d = 10.2;
		if(d instanceof Double)
		{
			System.out.println("d is pointing to Double object");
		}
		
		
	}
	}
