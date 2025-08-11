package Object_Oriented_Programmings;

class Alpha06
{
	
}
class Beta05 extends Alpha06
{
	
}
class Testable
{
	public void accept(Alpha06 al)
	{
		System.out.println("Alpha");
	}
	public void accept(Beta05 b1)
	{
		System.out.println("Beta");
	}
}
public class AmbiquityIssue11 
{
	public static void main(String[] args) 
	{
		Testable t1 = new Testable();
		t1.accept(null);
	}

}
