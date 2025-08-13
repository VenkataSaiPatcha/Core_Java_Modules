package Object_Oriented_Programmings;

class SuperClass01
{
	private void m1()
	{
		System.out.println("SuperClass01.m1()");
	}
}
class SubClass01 extends SuperClass01
{
	
	protected void m1()  // Re declaration (not overridden)
	{
		System.out.println("SubClass01.m1()");
	}
}
public class MethodOverriding06 
{
	public static void main(String[] args) 
	{
		new SubClass01().m1();
	}

}
