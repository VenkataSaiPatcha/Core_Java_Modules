package Object_Oriented_Programmings;
import java.lang.Object;
class Bottle01
{
	public Bottle01()
	{
		System.out.println("Bottle01.Bottle01()");
	}
}
public class NewInstanceDemo01 
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,IllegalAccessException
	{
		 Class cls=Class.forName("java.util.Date");
		Object cl= cls.newInstance();
		System.out.println(cl.getClass());
		System.out.println(cl.getClass().getName());
		 
	}

}
