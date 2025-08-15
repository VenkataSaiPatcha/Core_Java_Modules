package Object_Oriented_Programmings;

class Parent
{
	public static void m1()
	{
		System.out.println("Parent.m1()");// belong to class level
	}
}
class Child extends Parent
{
	/*public void m1()
	{
		System.out.println("Child.m1()"); // belongs to object level
	} */
}
public class MethodHiddingDemo02 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		
	}

}
