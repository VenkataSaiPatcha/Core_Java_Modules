package Object_Oriented_Programmings;

abstract class Wood
{
	public abstract void product();
	public abstract void price();
}
abstract class Chair extends Wood
{
	@Override
	public void product()
	{
		System.out.println("product is chair");
	}
}
class Table extends Chair
{
	@Override
	public void price()
	{
		System.out.println("table price is : 2000");
	}
}
public class AbstractClassDemo01 
{
	public static void main(String[] args) 
	{
		Table t1 = new Table();
		t1.product();
		t1.price();
		
	}

}
