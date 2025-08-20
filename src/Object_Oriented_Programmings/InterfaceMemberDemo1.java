package Object_Oriented_Programmings;

interface Printable
{
	//void move();
	//public String toString();
	//public int hashCode();
	//public boolean equals(Object obj);
	
}
class Print implements Printable
{
	@Override
	public String toString()
	{
		return "print()";
	}
}
public class InterfaceMemberDemo1 
{
	public static void main(String[] args) 
	{
		Printable p1 = new Print();
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());
		
	}

}
