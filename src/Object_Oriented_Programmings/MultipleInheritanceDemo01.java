package Object_Oriented_Programmings;

interface Vehicle04
{
	void run();
}
class Car04 implements Vehicle04
{
	@Override
	public void run() 
	{
		
	}
}
interface Battery extends Vehicle04
{
	// run method by default
	void battery();
}
class BatteryCar extends Car04 implements Battery
{

	@Override
	public void battery() 
	{
		
	}
	
}
public class MultipleInheritanceDemo01 
{
	public static void main(String[] args) 
	{
		
	}

}
