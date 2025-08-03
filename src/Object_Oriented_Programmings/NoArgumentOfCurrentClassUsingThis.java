package Object_Oriented_Programmings;

class Super01
{
	public Super01()
	{
		System.out.println("No argument super class constructor");
	}
	public Super01(String name)
	{
		this();
		System.out.println("Programmer name is :"+name);
	}
}
class Sub01 extends Super01
{
	public Sub01()
	{
		super("Sai");
		System.out.println("Sub class constructor");
	}
}
public class NoArgumentOfCurrentClassUsingThis 
{
	public static void main(String[] args) 
	{
		Sub01 s1 = new Sub01();
	}

}
