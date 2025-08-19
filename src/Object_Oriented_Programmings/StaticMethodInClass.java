package Object_Oriented_Programmings;

class SuperClassStatic
{
	public static void m1()
	{
		System.out.println("Super class static method");
	}
}
class SubClassStatic extends SuperClassStatic
{

}
public class StaticMethodInClass 
{
	public static void main(String[] args) 
	{
		SuperClassStatic.m1();
		SubClassStatic.m1();
		
		SubClassStatic s1 = new SubClassStatic();
		s1.m1();
	}

}
