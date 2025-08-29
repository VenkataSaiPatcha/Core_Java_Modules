package EnumConcepts;

enum ColorClasss
{
	Red, Green, Blue;
	
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}
}
public class Test13 
{
	public static void main(String[] args) 
	{
		System.out.println(ColorClasss.Blue);
	}

}
