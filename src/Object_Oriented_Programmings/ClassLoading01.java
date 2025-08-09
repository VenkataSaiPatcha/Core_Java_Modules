package Object_Oriented_Programmings;

class Mock
{
	static
	{
		System.out.println("static block of Mock class :");
	}
}
public class ClassLoading01
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		System.out.println(Class.forName("Object_Oriented_Programmings.Mock"));
		
	}

}
