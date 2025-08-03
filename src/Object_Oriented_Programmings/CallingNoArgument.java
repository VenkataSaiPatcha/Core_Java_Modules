package Object_Oriented_Programmings;

class Alpha02
{
	public Alpha02()
	{
		super();
		System.out.println("Alpha class :");
	}
}
class Beta02 extends Alpha02
{
	public Beta02()
	{
		super();
		System.out.println("Beta class :");
	}
}
public class CallingNoArgument 
{
	public static void main(String[] args) 
	{
		Beta02 b = new Beta02();
	}

}
