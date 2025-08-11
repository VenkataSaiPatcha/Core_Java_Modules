package Object_Oriented_Programmings;

class Ambiquity04
{
	public void accept(short ...x)
	{
		System.out.println("short");
	}
	public void accept(byte ...x)
	{
		System.out.println("byte");
	}
}
public class AmbiquityIssue04
{
	public static void main(String[] args) 
	{
		Ambiquity04 a1 = new Ambiquity04();
		a1.accept();
		
	}

}
