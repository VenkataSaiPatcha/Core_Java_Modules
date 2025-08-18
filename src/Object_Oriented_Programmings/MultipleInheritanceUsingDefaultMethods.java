package Object_Oriented_Programmings;

interface Flowers
{
	default void m1()
	{
		System.out.println("Flowers contains different colours");
	}
}
interface RedFlowers
{
	default void m1()
	{
		System.out.println("Red colour flowers are more beautiful");
	}
}
class White implements Flowers,RedFlowers
{
	@Override
	public void m1()
	{
		Flowers.super.m1();
		RedFlowers.super.m1();
		System.out.println("White.m1()");
	}
}
public class MultipleInheritanceUsingDefaultMethods 
{
	public static void main(String[] args) 
	{
		White w = new White();
		w.m1();
	}

}
