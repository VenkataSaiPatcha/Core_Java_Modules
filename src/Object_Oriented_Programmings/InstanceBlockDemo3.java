package Object_Oriented_Programmings;
class Foo
{
	{
		System.out.println("Instance block - 1");
	}
	Foo()
	{
		System.out.println("No - Argument constructor");
	}
	Foo(int x)
	{
		System.out.println("Parametersized constructor");
	}
	{
		System.out.println("Instance block - 2");
	}
}
public class InstanceBlockDemo3 {

	public static void main(String[] args) 
	{
		new Foo();
		new Foo(10);

	}

}
