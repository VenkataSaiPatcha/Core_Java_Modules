package Object_Oriented_Programmings;

public class MethodChainingDemo01 
{
	public static void main(String[] args) 
	{
		String str = "india"; // string literal
		char ch=str.concat(" is great").toUpperCase().charAt(0);
		System.out.println(ch);
		
	}

}
