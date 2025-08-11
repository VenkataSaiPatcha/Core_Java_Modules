package Object_Oriented_Programmings;

class Ambiquity09
{
	public void accept(String obj)
	{
		System.out.println("String");
	}
	public void accept(Object obj)
	{
		System.out.println("Object");
	}
}
public class AmbiquityIssue09 
{
	public static void main(String[] args) 
	{
		Ambiquity09 a1 = new Ambiquity09();
		a1.accept("Sai");
		
	}

}
