package Object_Oriented_Programmings;

abstract class Vehicle05
{
	//public static final int s=100;
	public abstract void run();
}
public class AbstractAnanomousInnerClass 
{
	public static void main(String[] args) 
	{
		Vehicle05 car = new Vehicle05() 
		{
			
			@Override
			public void run() 
			{
				System.out.println("Car is running");
				
			}
		};
		Vehicle05 bike = new Vehicle05()
				{
			@Override
			public void run()
			{
				System.out.println("Bike is running");
			}
				};
				car.run();
				bike.run();
	}

}
