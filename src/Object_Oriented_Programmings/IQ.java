package Object_Oriented_Programmings;

class Vehicle
{
	public int getHorsePower()
	{
		return 1000;
	}
	public void printHorsePower()
	{
		System.out.println(this.getHorsePower());
	}
}
class Fortuner extends Vehicle
{
	public int getHorsePower()
	{
		return 1200;
	}
	public void printHorsePower()
	{
		System.out.println(super.getHorsePower());//1000
	}
}
public class IQ 
{
	public static void main(String[] args) 
	{
		Vehicle v1 = new Fortuner();
		v1.printHorsePower();
		
	}

}
