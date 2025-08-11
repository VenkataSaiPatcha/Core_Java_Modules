package Object_Oriented_Programmings;
class Ambiquity13
{
	public void accept(Long l)
	{
		System.out.println("Long");
	}
	public void accept(Integer i)
	{
		System.out.println("Integer");
	}
}
public class AmbiquityIssue13 
{
	public static void main(String[] args) 
	{
		Ambiquity13 a1 = new Ambiquity13();
		a1.accept(10);// int to Integer autoboxing is done implicitly/widening/upcasting
	}

}
