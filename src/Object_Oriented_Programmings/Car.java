package Object_Oriented_Programmings;

public class Car 
{
	private String carName;
	private String carModel;
	private Engine engine;  // Has A Relation
	
	public Car(String carName, String carModel)
	{
		this.carName=carName;
		this.carModel=carModel;
		this.engine= new Engine("Petrol", 15000);
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", engine=" + engine + "]";
	}
	
}
