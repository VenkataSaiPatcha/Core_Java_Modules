package Object_Oriented_Programmings;

class Ambiquity14
{
	public void accept(int ...x)
	{
		System.out.println("var-args");  // 3 - var-args
	}
	public void accept(Integer i)
	{
		System.out.println("Integer"); // 2 - AutoBoxing
	}
//	public void accept(long l)
//	{
//		System.out.println("long");  //1 - widening
//	}
}
public class AmbiquityIssue14 
{
	public static void main(String[] args) 
	{
		Ambiquity14 a1 = new Ambiquity14();
		a1.accept(10);
	}

}
