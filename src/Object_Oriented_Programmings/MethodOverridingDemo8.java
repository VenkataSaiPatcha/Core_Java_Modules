package Object_Oriented_Programmings;

class Stationary
{
	public void m1()
	{
		System.out.println("Stationary.m1()");
	}
}
class Books extends Stationary
{
	/*	@Override
	public int m1() 
	{
		// TODO Auto-generated method stub
		return 0;
	} */
}
public class MethodOverridingDemo8 
{
	public static void main(String[] args) 
	{
		Stationary s1 = new Books();
		s1.m1();
	}

}
