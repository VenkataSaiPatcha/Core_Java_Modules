package Object_Oriented_Programmings;

class Ambiquity06

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
public class AmbiquityIssue06 
{
	public static void main(String[] args) 
	{
		Ambiquity06 a1 = new Ambiquity06();
		//a1.accept(15); // error because 15 is int type we can't assign to byte and short
		a1.accept((byte)15);
		a1.accept((short)15);
	}

}
