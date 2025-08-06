package Object_Oriented_Programmings;
class Laptop
{
	static
	{
		System.out.println("Demo04.enclosing_method()");
	}
}
public class ReflectionAPI 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		System.out.println(Class.forName("Object_Oriented_Programmings.Laptop"));
	}

}
