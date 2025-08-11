package Object_Oriented_Programmings;

class Ambiquity10
{
	public void accept(String str)
	{
		System.out.println("String");
	}
	public void accept(Integer in)
	{
		System.out.println("Integer");
	}
	public void accept(Object obj)
	{
		System.out.println("Object");
	}
}
public class AmbiquityIssue010 
{
	public static void main(String[] args) 
	{
		Ambiquity10 a1 = new Ambiquity10();
		//a1.accept(null);
		
	}

}
