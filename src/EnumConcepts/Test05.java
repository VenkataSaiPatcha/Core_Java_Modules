package EnumConcepts;

class Hello
{
	int x = 100;
}
enum Directions //extends Hello
{
	North, South, East, West;
}
public class Test05 
{
	public static void main(String[] args) 
	{
		System.out.println(Directions.East);
		
	}

}
