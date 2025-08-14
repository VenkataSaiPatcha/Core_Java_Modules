package Object_Oriented_Programmings;

class Method
{
	public Method m1()
	{
		System.out.println("Method.m1()");
		return this;
	}
}
class Object extends Method
{
	@Override
	public Object m1()
	{
		System.out.println("Object.m1()");
		return null; 
	}
}
public class MethodOverridingDemo02 
{
	public static void main(String[] args) 
	{
		Object obj = new Object();
		System.out.println(obj.m1());
	}

}
