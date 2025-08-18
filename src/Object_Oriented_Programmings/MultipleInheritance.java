package Object_Oriented_Programmings;

interface AAAA
{
	void m1();
}
interface BBB extends AAAA
{
	void m1();
	
}
class Implementor implements AAAA,BBB
{

	@Override
	public void m1() 
	{
		System.out.println("Implementor.m1()");
		
	}
	
}
public class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		
		AAAA i = new Implementor();
		i.m1();
		
		BBB ii = new Implementor();
		ii.m1();
	}

}
