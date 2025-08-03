package Object_Oriented_Programmings;

class Apple
{
	public Apple()
	{
		System.out.println("Apple class constructor :");
	}
}
class Banana extends Apple
{
	
}
class Carrot extends Banana
{
	public Carrot()
	{
		System.out.println("Carrot class constructor :");
	}
}

public class ConstructorChainingDemo 
{
	public static void main(String[] args) 
	{
		Carrot c1 = new Carrot();
	}

}
