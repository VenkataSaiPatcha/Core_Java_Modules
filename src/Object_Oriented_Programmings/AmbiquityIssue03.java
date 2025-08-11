package Object_Oriented_Programmings;

class Ambiquity03
{
	public void accept(short ...x)
	{
		System.out.println("short");
	}
	public void accept(char ...ch)
	{
		System.out.println("char");
	}
}
public class AmbiquityIssue03 
{
	public static void main(String[] args) 
	{
		Ambiquity03 a1 = new Ambiquity03();
		//a1.accept();
	}

}
