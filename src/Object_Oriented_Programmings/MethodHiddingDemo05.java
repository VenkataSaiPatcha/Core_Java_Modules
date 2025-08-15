package Object_Oriented_Programmings;

class Parent01
{
	public static void m1()
	{
		System.out.println("Parent01.m1()");
	}
}
class Child01 extends Parent01 // return type is not compatible
{
	/*public static int m1()
	{
		return 0;
	} */
}
public class MethodHiddingDemo05 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Hello world !");
	}

}
