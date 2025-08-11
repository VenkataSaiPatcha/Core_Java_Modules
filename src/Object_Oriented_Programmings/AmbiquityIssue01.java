package Object_Oriented_Programmings;

class Test08
{
	public void accept(int x)
	{
		System.out.println("int");
	}
	public void accept(char ch)
	{
		System.out.println("char");
	}
}
public class AmbiquityIssue01 
{
	public static void main(String[] args) 
	{
		Test08 t1 = new Test08();
		t1.accept(10);
		
	}

}
