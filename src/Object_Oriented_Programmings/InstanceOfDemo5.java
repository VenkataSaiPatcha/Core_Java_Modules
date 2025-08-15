package Object_Oriented_Programmings;

class Bird02
{
	
}
class Parrot02 extends Bird02
{
	
}
class Sparrow02 extends Bird02
{
	
}
public class InstanceOfDemo5 
{
	public static void main(String[] args) 
	{
		Parrot02 p1 = new Parrot02();
		Sparrow02 s1 = new Sparrow02();
		
		acceptBird(s1);
	}
	public static void acceptBird(Bird02 bird)
	{
		if(bird instanceof Parrot02)
		{
			System.out.println(" sparrow is an instance of parrot");
		}
		else
		{
			System.out.println("sparrow is  an another instance");
		}
	}

}
