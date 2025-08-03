package Object_Oriented_Programmings;

class SuperClass
{
	public SuperClass(String name)
	{
		System.out.println("Developer name is :"+name);
	}
}
class SubClass extends SuperClass
{
	public SubClass()
	{
		super("Sai");
		System.out.println("Sub class Constructor");
	}
}
public class ParameterizedConstructor 
{
	public static void main(String[] args) 
	{
		SubClass sub = new SubClass();
	}

}
