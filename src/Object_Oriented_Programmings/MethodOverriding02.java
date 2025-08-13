package Object_Oriented_Programmings;

class Bird
{
	void fly()
	{
		System.out.println("All birds are fly");
	}
}
class Parrot extends Bird
{
	@Override
	void fly()
	{
		System.out.println("Parrot is beautiful");
	}
}
class Sparrow extends Bird
{
	void fly()
	{
		System.out.println("Sparrow's are flying  ");
	}
}
public class MethodOverriding02 
{
	public static void main(String[] args) 
	{
		Bird b1 = null;
		b1=new Parrot(); b1.fly();
		b1=new Sparrow(); b1.fly();
		
	}

}
