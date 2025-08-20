package Object_Oriented_Programmings;

interface PlugBox
{
	double wirePrice=100; //jdk 1.0
	void m1(); //jdk 1.0
	
	default void m2() // jdk 1.8
	{
		m4();
		m5();
	}
	static void m3() //jdk 1.8
	{
		m4();
		
	}
	private static void m4()  // jdk 9v
	{
		System.out.println("private static method");
	}
	private void m5()    //jdk 9v
	{
		System.out.println("pivate non-static method");
	}
}
class Wires implements PlugBox
{
	@Override
	public void m1() 
	{
		System.out.println("M1 overridden method");
		
	}
}
public class InterfaceMemberDemo3
{
	public static void main(String[] args) 
	{
		PlugBox p1 = new Wires();
		p1.m1();
		System.out.println(p1.wirePrice);
		p1.m2();
		PlugBox.m3();
		
	}

}
