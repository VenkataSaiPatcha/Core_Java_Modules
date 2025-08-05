package Object_Oriented_Programmings;

public class MethodChainingDemo02
{
	public static void main(String[] args) 
	{
		String str = "Hyderabad";
		int length =str.concat(" is an IT city").toLowerCase().length();
		System.out.println(length);
		
	}

}
