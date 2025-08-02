package Object_Oriented_Programmings;
class TestClass
{
	final int x; //blank final field
	
	{
		m1();
		x=200;
		
	}
	public void m1()
	{
		System.out.println("Default Value is :"+x);  //0
	}
}
public class BlankFinalFieldDemo02 
{
	public static void main(String[] args) 
	{
		TestClass t1 = new TestClass();
		System.out.println(t1.x);
		
	}

}
