package Object_Oriented_Programmings;
public class InstanceofDemo3 
{
	public static void main(String[] args) 
	{
		String str = "Hello"; // String literal
		if(str instanceof String)
		{
			System.out.println("str is an instance of String class");
		}
		Integer i = 10;
		if(i instanceof Integer)
		{
			System.out.println("i is an instance of Integer class");
		}
	}

}
