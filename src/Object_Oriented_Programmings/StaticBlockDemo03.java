package Object_Oriented_Programmings;
class Demo01
{
	static int x;
	static
	{
		System.out.println("static values also contains default values :"+x);
	}
	{
		System.out.println("Non - static block");
	}
}
public class StaticBlockDemo03 
{
	public static void main(String[] args) 
	{
//		System.out.println("Main method");
//		System.out.println(Demo01.x);
		new Demo01();
	}

}
