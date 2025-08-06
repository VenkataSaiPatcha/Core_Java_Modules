package Object_Oriented_Programmings;
class A
{
	static
	{
		System.out.println("A");
	}
	{
		System.out.println("B");
	}
	A()
	{
		System.out.println("C");
	}
}
class B extends A
{
	static
	{
		System.out.println("D");
	}
	{
		System.out.println("E");
	}
	B()
	{
		System.out.println("F");
	}
}
public class StaticBlockDemo05 {

	public static void main(String[] args) 
	{
		new B();

	}

}
