package LogicalPrograms;
sealed class BatteryVehicle permits BatteryCar,BatteryBike,BatteryTruck
{
	public void run()
	{
		System.out.println("Battery vehicles are running");
	}
}
 non-sealed class BatteryCar extends BatteryVehicle
{
	@Override
	 public void run()
	{
		System.out.println("Battery car is running");
	}
}
non-sealed class BatteryBike extends BatteryVehicle
 {
	 @Override
	public void run()
	 {
	
		System.out.println("Battery bike is running");
	}
 }
final class BatteryTruck extends BatteryVehicle
{
	@Override
	public void run() 
	{
		System.out.println("Battery truck is running");
	}
}
public class SealedClassDemo02 
{
public static void main(String[] args) 
{
	
	BatteryVehicle vehicle = null;
	vehicle = new BatteryCar(); vehicle.run();
	vehicle = new BatteryBike(); vehicle.run();
	vehicle = new BatteryTruck(); vehicle.run();
}
}
