package Object_Oriented_Programmings;

public class StaticBlockDemo08 
{
	static final int x;  // Blank final field
	static
	{
		m1();
		x=200;
	}
	public static void m1()
	{
		System.out.println("Deault value of x :"+x);
	}
	public static void main(String[] args) 
	{
		System.out.println("After initilization :"+StaticBlockDemo08.x);
	}

}
