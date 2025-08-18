package Object_Oriented_Programmings;
@FunctionalInterface
interface Computer
{
	void laptop();
}
public class LamdaExpressionDemo01
{
	public static void main(String[] args) 
	{
		/*Computer c1 = new Computer()  normal ananimous inner class to call the abstract method inside the interface 
		{	
			@Override
			public void laptop()
			{
				System.out.println("laptop is less weight compare to pc");
			}
		};
		c1.laptop(); */
		
		Computer c2 =()->System.out.println("MacBook air is high secure");
		c2.laptop();
	}

}
