package Object_Oriented_Programmings;

import java.lang.Object;
class Student10
{
	public void greet()
	{
		System.out.println("Student10.greet()");
	}
}
class Sample10
{
	public void greet()
	{
		System.out.println("Sample10.greet()");
	}
}
public class ObjectAtRuntimeDemo01 
{
	public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException 
	{
		Object cls=Class.forName("Object_Oriented_Programmings.Sample10").newInstance();
		if(cls instanceof Student10)
		{
			Student10 s1 = (Student10)cls;
			s1.greet();
			System.out.println(s1.getClass()+"_ "+s1.getClass().getName());
		}
		else if(cls instanceof Sample10)
		{
			Sample10 s2 = (Sample10)cls;
			s2.greet();
			System.out.println(s2.getClass()+" "+s2.getClass().getName());
		}
	}

}
