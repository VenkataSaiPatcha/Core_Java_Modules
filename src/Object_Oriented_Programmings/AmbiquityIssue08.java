package Object_Oriented_Programmings;
class Ambiquity08
{
	public void accept(Object obj)
	{
		System.out.println("object");
	}
	public void accept(String str)
	{
		System.out.println("String");
	}
}
public class AmbiquityIssue08 
{
	public static void main(String[] args) 
	{
		Ambiquity08 a1 = new Ambiquity08();
		//a1.accept(10);
		
	}

}
