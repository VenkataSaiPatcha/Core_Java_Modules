package Object_Oriented_Programmings;

class Ambiquity07
{
	public void accept(int x, long l)
	{
		System.out.println("int-long");
	}
	public void accept(long l, int x)
	{
		System.out.println("long-int");
	}
}
public class AmbiquityIssue07 
{
	public static void main(String[] args) 
	{
		Ambiquity07 a1 = new Ambiquity07();
		//a1.accept(9, 9);
		
	}

}
