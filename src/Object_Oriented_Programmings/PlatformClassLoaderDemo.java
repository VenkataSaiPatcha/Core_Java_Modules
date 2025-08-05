package Object_Oriented_Programmings;
class Foo01
{
	
}
public class PlatformClassLoaderDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Super class of application class loader is : "+
	Foo01.class.getClassLoader().getParent());
		
	}

}
