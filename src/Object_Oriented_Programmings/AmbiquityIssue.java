package Object_Oriented_Programmings;

class Ambiquity
{
	public void add(double x, double y)
	{
		System.out.println("double");
	}
	public void add(float x, float y)
	{
		System.out.println("float");
	}
}
public class AmbiquityIssue 
{
	public static void main(String[] args) 
	{
		Ambiquity am = new Ambiquity();
		am.add(10, 20);
		
	}

}
