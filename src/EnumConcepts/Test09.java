package EnumConcepts;

enum Seasons
{
	Summer, Rainy, Winter, Spring, Fall;
	private Seasons()
	{
		System.out.println("constructor is executed ....");
	}
}
public class Test09 
{
	public static void main(String[] args) 
	{
		System.out.println(Seasons.Fall);
		System.out.println(Seasons.Spring);
		
	}

}
