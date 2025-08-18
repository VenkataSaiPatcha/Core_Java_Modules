package Object_Oriented_Programmings;

interface WoodIteam
{
	default void m1()
	{
		System.out.println("default method :Using wood we can create many Iteams");
	}
}
class ChairIteam
{
	public void m1()
	{
		System.out.println("chair class from wood");
	}
}
class House extends ChairIteam implements WoodIteam
{
	
}
public class DefaultMethodJava_8Demo01 
{
	public static void main(String[] args) 
	{
		House house = new House();
		house.m1();
	}

}
