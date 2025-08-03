package Object_Oriented_Programmings;
class Base
{
	public Base()
	{
		this(100);
		System.out.println("No argument constructor of Base class");
	}
	public Base(int x)
	{
		System.out.println("Value of x is:"+x);
	}
}
class Derived extends Base
{
	public Derived()
	{
		System.out.println("No argument constructor of derived class");
	}
}
public class NoArgumentOfCurrentClassUsingThis02 
{
	public static void main(String[] args) 
	{
		Derived d1 = new Derived();
	}

}
