package Object_Oriented_Programmings;

public class AutoUnboxing 
{
	public static void main(String[] args) 
	{
		Integer i = 15;
		int x=i.intValue();
		System.out.println(x); // JDK 1.4
		
		Integer j = 20;
		int y=j;
		System.out.println(y); // JDK 1.5
	}

}
