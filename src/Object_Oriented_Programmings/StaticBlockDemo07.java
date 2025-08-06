package Object_Oriented_Programmings;

public class StaticBlockDemo07 
{
	static
	{
		System.out.println("Static Block");
		//return;  compilation error
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
	}

}
