package Object_Oriented_Programmings;

sealed class Bird03 permits Parrot03,Sparrow03 // permit the class those are extended class from sealed class
{
	public void roam()
	{
		System.out.println("Bird's are roaming ");
	}
}
non-sealed class Parrot03 extends Bird03
{
	@Override
	public void roam()
	{
		System.out.println("All parrot are roaming ");
	}
}
final class Sparrow03 extends Bird03
{
	@Override
	public void roam()  // we can't perform inheritance on the final class
	{
		System.out.println("All sparrow's are roaming");
	}
}
class Peacock extends Parrot03
{
	// if we declare a extended class as non-sealed we can also inherit the class using sub class
}
public class SealedClassDemo01 
{
	public static void main(String[] args) 
	{
		Bird03 b=null; 
		b=new Parrot03(); b.roam();
		b=new Sparrow03(); b.roam();
		
	}

}
