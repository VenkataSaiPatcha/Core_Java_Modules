package Object_Oriented_Programmings;

class Alpha04
{
	static
	{
		System.out.println("Aplha01.enclosing_method()");
	}
	
}
class Beta01 extends Alpha04
{
	static
	{
		System.out.println("Beta01.enclosing_method()");
	}
}
public class InheritanceLoading 
{	
	public static void main(String[] args) 
	{
		System.out.println("Main method !!");
		new Beta01();
	}
}
