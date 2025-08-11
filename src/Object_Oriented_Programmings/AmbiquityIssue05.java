package Object_Oriented_Programmings;

class Ambiquity05
{
	public void accept(double ...x)
	{
	System.out.println("double");	
	}
	public void accept(long ...x)
	{
		System.out.println("long");
	}
}
public class AmbiquityIssue05 
{
	public static void main(String[] args) 
	{
		Ambiquity05 a1 = new Ambiquity05();
		a1.accept(10);
		
	}

}
