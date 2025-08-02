package Object_Oriented_Programmings;
class Alpha
{
	final int x;
	
	public Alpha()
	{
		x=200;
		System.out.println("value of x is :"+x);
	}
	public Alpha(int y)
	{
		this.x=y;
	}
}
public class BlankFinalFieldDemo03
{
	public static void main(String[] args) 
	{
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha(300);
		System.out.println(a2.x);
		
	}

}
