package Object_Oriented_Programmings;
import java.lang.Class;
class Employee04
{
	
}
class Student04
{
	
}
class Sample04
{
	
}
public class ClassLoadingInformation 
{
	public static void main(String[] args) 
	{
				Class cls= null;
				cls=Employee04.class;
				System.out.println(cls.getName());
				
				System.out.println("----------------");
				cls = Student04.class;
				System.out.println(cls);
				
				System.out.println("----------------");
				cls = Sample04.class;
				System.out.println(cls);
	}

}
