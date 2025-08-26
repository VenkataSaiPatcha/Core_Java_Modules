package Object_Oriented_Programmings;

class Ambiquity15
{
	public void accept(Double d)
	{
		System.out.println("Double");
	}
	public void accept(Number n)
	{
		System.out.println("Number");
	}
}
public class AmbiquityIssue15
{
	public static void main(String[] args) 
	{
		Ambiquity15 a1 = new Ambiquity15();
		a1.accept(10);
	}

}
