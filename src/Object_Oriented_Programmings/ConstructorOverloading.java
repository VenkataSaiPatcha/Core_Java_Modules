package Object_Oriented_Programmings;

class Calculate
{
	public Calculate(int x, int y)
	{
		System.out.println("Sum of "+x+" and "+y+" :"+(x+y));
	}
	public Calculate(int x)
	{
		this(10,20);
		System.out.println("Square of "+x+" is :"+(x*x));
	}
}
public class ConstructorOverloading 
{

	public static void main(String[] args) 
	{
		Calculate cal = new Calculate(5);

	}

}
