package Object_Oriented_Programmings;
class Record
{
	
}
public class PlatformClassLoaderDemo01 
{
	public static void main(String[] args) 
	{
		System.out.println("super class of platform class loader is : "+
	Record.class.getClassLoader().getParent().getParent());
		
	}

}
