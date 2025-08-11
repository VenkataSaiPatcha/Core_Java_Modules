package Object_Oriented_Programmings;
class Ambiquity01
{
	public void accept(char...ch)
	{
		System.out.println("char");
	}
	public void accpt(int ...x)
	{
		System.out.println("int");
	}
}
public class AmbiquityIssue02 
{
	public static void main(String[] args) 
	{
		Ambiquity01 a1 =new Ambiquity01();
		a1.accept();
		
	}

}
