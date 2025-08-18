package Object_Oriented_Programmings;

interface Vehicle07
{
	void run();
	void horn();
	default void digitalMeter()
	{
		System.out.println("Default implemenatation");
		System.out.println("Digital meter support is comming soon !!");
	}
	
}
class Car07 implements Vehicle07
{
	@Override
	public void horn() 
	{
	System.out.println("car horn is very loud");	
	}
	@Override
	public void run() 
	{
	System.out.println("Car ran's very fast than the others");	
	}
	@Override
	public void digitalMeter()
	{
		System.out.println("car is having digital meter support");
	}
	
}
class Bike07 implements Vehicle07
{
	@Override
	public void horn() 
	{
		System.out.println("Bike horn sound is less");
	}
	@Override
	public void run() 
	{
	System.out.println("Bike is ran very less speed");	
	}
}

public class DefaultMethodJava_8
{
	public static void main(String[] args) 
	{
		Vehicle07 v1 = null;
		v1 = new Bike07(); v1.run();v1.horn();v1.digitalMeter();
		v1 = new Car07(); v1.run(); v1.horn();v1.digitalMeter();
	}
}