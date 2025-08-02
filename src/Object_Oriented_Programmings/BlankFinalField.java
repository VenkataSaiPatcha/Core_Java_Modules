package Object_Oriented_Programmings;

class Sample02
{
	final int x;
	{
		//x=200;
	}
	public Sample02()
	{
		x=300;
	}
}
public class BlankFinalField 
{
	public static void main(String[] args) 
	{
		Sample02 s1 = new Sample02();
		System.out.println(s1.x);
		
	}

}
