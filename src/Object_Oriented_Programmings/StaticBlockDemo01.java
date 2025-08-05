package Object_Oriented_Programmings;

class Foo02
{
	Foo02()
	{
		System.out.println("No -Arg constructor :");
	}
	
	static
	{
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
}
public class StaticBlockDemo01 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}

}
