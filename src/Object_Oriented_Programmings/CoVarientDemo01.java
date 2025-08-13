package Object_Oriented_Programmings;

class Alpha07
{
	
}
class Beta07 extends Alpha07
{
	
}
class SuperClass02
{
	protected int m1=100;
	public Alpha07 m1()
	{
		System.out.println("SuperClass02.m1()");
		return new Alpha07();
	}
}
class SubClass02 extends SuperClass02
{
	@Override
	public Beta07 m1()
	{
		System.out.println("SubClass02.m1()");
		return new Beta07();
	}
}
public class CoVarientDemo01 
{
	public static void main(String[] args) 
	{
		SubClass02 sub = new SubClass02();
		sub.m1(); // dynamic polymorphism
		System.out.println(sub.m1); // static polymorphism
		
	}

}
