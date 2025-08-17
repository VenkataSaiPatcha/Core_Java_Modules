package Object_Oriented_Programmings;

abstract class Bike
{
	protected int speed=180;
	public Bike()
	{
		System.out.println("Bike class constructor");
	}
	public void setBikeDetails()
	{
		System.out.println("Bike is New model");
	}
	public abstract void run();
}
class GT650 extends Bike
{
	@Override
	public void run() 
	{
		System.out.println("GT650 bike is running");
	}
}
public class AbstractClassDemo02 
{
	public static void main(String[] args) 
	{
		Bike b = null;
		b = new GT650();
		System.out.println("Bike speed is :"+b.speed);
		b.setBikeDetails();
		b.run();
		
	}

}
