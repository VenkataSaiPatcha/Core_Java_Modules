package Object_Oriented_Programmings;

import java.lang.Object;
class Alpha08
{
	
}
class Beta08 extends Alpha08
{
	
}
class Gamma extends Beta08
{
	
}
public class InstanceofDemo2
{
	public static void main(String[] args) 
	{
		Gamma g1 = new Gamma();
		if(g1 instanceof Gamma)
		{
			System.out.println("g1 is an instance of Gamma class");
		}
		if(g1 instanceof Beta08)
		{
			System.out.println("g1 is an instance of Beta08 class");
		}
		if(g1 instanceof Alpha08)
		{
			System.out.println("g1 is an instance of Alpha08 class");
		}
		if(g1 instanceof Object)
		{
			System.out.println("g1 is an instance of object class");
		}
	}

}
