package Object_Oriented_Programmings;
import java.lang.Object;
class StudentClass
{
	
}
class EmployeeClass01
{
	
}
public class ObjectAtRuntime 
{
	public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException
	{
		Class cls=Class.forName("Object_Oriented_Programmings.StudentClass");
		Object obj=cls.newInstance();
		
		System.out.println(obj.getClass().getName());
		
	}

}
