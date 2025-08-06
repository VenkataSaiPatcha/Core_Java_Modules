package Object_Oriented_Programmings;
class Demo05
{
	static
	{
		i=100;
		//System.out.println(i);
		System.out.println(Demo05.i);
	}
	static int i;
}
public class StaticBlockDemo06
{
	public static void main(String[] args) 
	{
		System.out.println(Demo05.i);
	}

}
