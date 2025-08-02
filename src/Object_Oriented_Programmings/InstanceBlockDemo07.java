package Object_Oriented_Programmings;
class Hello
{
	public Hello()
	{
		System.out.println("Constructor");
		{
			System.out.println("Non - Stack - Block - 1");
		}
	}
	{
		System.out.println("Non - static - block - 2");
	}
}
public class InstanceBlockDemo07 
{
	public static void main(String[] args) 
	{
		new Hello();
		
	}

}
