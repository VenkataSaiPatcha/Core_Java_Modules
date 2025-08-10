package Object_Oriented_Programmings;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ClassInformationDemo
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class cls = Class.forName("Object_Oriented_Programmings.MethodArea");
		
		System.out.println("Class name :"+cls.getName());
		System.out.println("package name is :"+cls.getPackageName());
		
		Method[] methods = cls.getDeclaredMethods(); 
		System.out.println("method names are :");
		int count = 0;
		for(Method method : methods)
		{
			System.out.println(method.getName());
			count++;
		}
		System.out.println("Total no of counts :"+count);
		
		count=0;
		
		Field[] fields = cls.getDeclaredFields();
		System.out.println("Available fields are :");
		for(Field field:fields)
		{
			System.out.println(field.getName());
			count++;
		}
		System.out.println("Total no of fields :"+count);
	}

}
