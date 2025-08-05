package Object_Oriented_Programmings;
//public ClassLoader getClassLoader();
class Customer03
{
	
}
public class ApplicationClassLoaderDemo {

	public static void main(String[] args) 
	{
		System.out.println("The Customer03.class file will be loaded by : "+
				Customer03.class.getClassLoader());

	}

}
