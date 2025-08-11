package Object_Oriented_Programmings;

public class Unboxing 
{
	public static void main(String[] args) 
	{
		Integer x=100;
		int y=x.intValue(); //JDK 1.4
		System.out.println(y);
		
		int z=x;
		System.out.println(z); // JDK 1.5
	}

}
