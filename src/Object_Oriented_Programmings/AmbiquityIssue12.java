package Object_Oriented_Programmings;

class Ambiquity12
{
	public void accept(Number n)
	{
		System.out.println("number");
	}
	public void accept(Integer i)
	{
		System.out.println("integer");
	}
}
public class AmbiquityIssue12
{
	public static void main(String[] args) 
	{
		Ambiquity12 a1 = new Ambiquity12();
		a1.accept(100+0.5);
	}

}
