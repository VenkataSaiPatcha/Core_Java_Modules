package Object_Oriented_Programmings;

@FunctionalInterface
interface DifferentVehicles
{
	void run();
}
public class LambdaExpressionDemo01 
{
	public static void main(String[] args) 
	{
		DifferentVehicles car = ()-> System.out.println("Car is  running");
		DifferentVehicles bike = ()-> System.out.println("Bike is running");
		DifferentVehicles lorry = ()-> System.out.println("Lorry is running");
		
		car.run();
		bike.run();
		lorry.run();
		
		
	}

}
