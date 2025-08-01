package Object_Oriented_Programmings;

public class PassByValue02 
{
	public static void main(String[] args) 
	{
		int x = 100;
		x=accept(x);
		System.out.println(x);
		
	}
	public static int accept(int y)
	{
		y=200;
		return y;
	}

}
