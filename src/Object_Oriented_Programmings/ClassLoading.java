package Object_Oriented_Programmings;
class Demo06
{
	static int x = 100;
	static
	{
		System.out.println("Static block execution with x value :"+x);
	}
}
public class ClassLoading
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method !");  
		new Demo06();
		//System.out.println(Demo06.x);
	}

}
