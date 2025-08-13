package Object_Oriented_Programmings;

public class StaticDemo 
{
	int x;
	public StaticDemo(int x)
	{
		this.x = x;
	}
	public static void greet()
	{
		//System.out.println(x);
	}
	public static void main(String[] args) 
	{
		StaticDemo s1 = new StaticDemo(10);
		s1.greet();
		
	}
}
