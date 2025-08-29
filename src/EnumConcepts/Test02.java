package EnumConcepts;

enum Month
{
	January, Febuary, March;  // outside of the class
}
public class Test02
{
	enum Color
	{
		RED, BLUE, GREEN;   // inside a class
	}
	public static void main(String[] args) 
	{
		enum Week
		{
			Monday, Tuesday, Friday, Sunday   // inside a method
		}
		System.out.println(Month.January);
		System.out.println(Color.GREEN);
		System.out.println(Week.Sunday);
	}

}
