package Object_Oriented_Programmings;

class Test05
{
	public static final Test05 t1 = new Test05(); // t1=null
	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("non static block");
	}
	public Test05() {
		System.out.println("no argument constructo");
	}
}
public class StaticBlockDemo09 
{
	public static void main(String[] args) 
	{
		new Test05();
		
	}

}
