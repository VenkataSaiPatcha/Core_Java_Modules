package Object_Oriented_Programmings;

sealed interface Vehicle06
{
	int speed = 100; // public + static + final
	void race(); // public + abstract
}
non-sealed class Car06 implements Vehicle06
{
	@Override
	public void race()
	{
		//speed=200; Error
		System.out.println("Car is running with :"+speed+"km/hrs");
	}
}
public class InterfaceDemo01 
{
	public static void main(String[] args) 
	{
		Vehicle06 v1 = new Car06();
		System.out.println("speed of car is :"+v1.speed);
		v1.race();
		
	}

}
