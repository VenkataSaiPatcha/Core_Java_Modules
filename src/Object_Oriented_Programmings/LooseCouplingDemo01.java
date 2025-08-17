package Object_Oriented_Programmings;
interface HotDrink
{
	void prepare();
}
class Tea implements HotDrink
{
	@Override
	public void prepare()
	{
		System.out.println("Tea is preparing");
	}
}
class Coffee implements HotDrink
{
	@Override
	public void prepare() 
	{
System.out.println("Coffee is preparing");		
	}
}
class Horlicks implements HotDrink
{
	@Override
	public void prepare() 
	{
		System.out.println("Horlick's is preparing");
	}
}
class Resturant
{
	public static void acceptObject(HotDrink drink)
	{
		drink.prepare();
	}
}
public class LooseCouplingDemo01 
{
	public static void main(String[] args) 
	{
		Resturant.acceptObject(new Coffee());
		Resturant.acceptObject(new Horlicks());
		Resturant.acceptObject(new Tea());
	}

}
