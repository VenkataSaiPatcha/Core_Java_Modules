package Object_Oriented_Programmings;
class Test03
{
	static int x;
	static
	{
		x=100;  // 300
		System.out.println("x value is :"+x);
	}
	static
	{
		x=200;
		System.out.println("x value is :"+x);
	}
	static 
	{
		x=300;
		System.out.println("x value is :"+x);
	}
}
public class StaticBlockDemo02 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		System.out.println(Test03.x);
	}

}
