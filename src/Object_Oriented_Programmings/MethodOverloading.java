package Object_Oriented_Programmings;

class Overloading
{
	public int doSum(int x , int y)
	{
		return x+y;
	}
	public double doSum(double x, double y)
	{
		return x*y;
	}
	public String doSum(String x, String y)
	{
		return x+y;
	}
}
public class MethodOverloading 
{
		public static void main(String[] args) 
		{
			Overloading ov = new Overloading();
			int sum = ov.doSum(10, 20);
			System.out.println("sum of int values :"+sum);
			
			double add = ov.doSum(120.0, 130.0);
			System.out.println("addition of double values :"+add);
			
			String concat=ov.doSum("Venkata", "Sai");
			System.out.println("addition of string values :"+concat);
		}
}
