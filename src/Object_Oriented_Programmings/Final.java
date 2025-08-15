package Object_Oriented_Programmings;

final class AA
{
	 int x=100;
	
	AA() 
	{
		x=2000;
		System.out.println("AA.AA()"+x);
	}
}
class BB 
{
	
}
public class Final
{
	public static void main(String[] args) 
	{
		AA a = new AA();
	}

}
