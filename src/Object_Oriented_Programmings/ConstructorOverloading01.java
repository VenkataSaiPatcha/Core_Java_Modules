package Object_Oriented_Programmings;

class Calculate01
{
	public Calculate01()
	{
		this(10,20);
		System.out.println("No param constructor");
	}
	public Calculate01(int x ,int y)
	{
		this(10,20,30);
		System.out.println("sum of two :"+(x+y));
	}
	public Calculate01(int x, int y, int z)
	{
		System.out.println("sum of three parameters :"+(x+y+z));
	}
}
public class ConstructorOverloading01
{
	public static void main(String[] args) 
	{
		new Calculate01();
		
	}

}
