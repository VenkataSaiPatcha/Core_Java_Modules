package Object_Oriented_Programmings;

public class ImmutableDemo 
{
	public static void main(String[] args)
	{
		Integer i = new Integer(10);
		accept(i);
		System.out.println(i);
	}
	public static void accept(int y)
	{
		y=20;
	}

}
