package Object_Oriented_Programmings;

class Father
{
	public void house()
	{
		System.out.println("2 BHK House");
	}
}
class Son extends Father
{
	public void car()
	{
		System.out.println("Audi Car");
	}
}
public class SingleLevelInheritance 
{
	public static void main(String[] args) 
	{
		
		Son son = new Son();
		son.car();
		son.house();
	}

}
