package Object_Oriented_Programmings;

class SuperDemo
{
	public SuperDemo m1()
	{
		System.out.println("SuperDemo.m1()");
		return this;
	}
}
class SubDemo extends SuperDemo
{
	@Override
	public SubDemo m1()
	{
		System.out.println("SubDemo.m1()");
		return this;
	}
}
public class MethodOverridingDemo01 
{
	public static void main(String[] args) 
	{
		SubDemo demo = new SubDemo();
		demo.m1();
	}

}
