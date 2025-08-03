package Object_Oriented_Programmings;

class Alpha01
{
	public String toString()
	{
		return "India";
	}
}
class Beta extends Alpha01
{
	public String toString() // method overriding
	{
		System.out.println(super.toString());  
		return "Hyderabad";
	}
}
public class SuperMethodCall
{
	public static void main(String[] args) 
	{
		Beta b = new Beta();
		
		System.out.println(b.toString());
	}

}
