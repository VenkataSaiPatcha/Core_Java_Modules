package Object_Oriented_Programmings;

class Bottle
{
	public  void m1()
	{
		
	}
}
class WaterBottle extends Bottle
{
	/*@Override
	protected void m1() {
		// TODO Auto-generated method stub // here we will get error(we can't reduce the visibility  of a method in sub class )
		super.m1();
	}*/
}
public class MethodOverridingDemo7 
{
	public static void main(String[] args) 
	{
		Bottle b1 = new Bottle();
		b1.m1();
		
	}

}
