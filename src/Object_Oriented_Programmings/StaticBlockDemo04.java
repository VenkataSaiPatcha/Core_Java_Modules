package Object_Oriented_Programmings;
class Demo03
{
	 final static int x ; //Blank final field
	 static
	 {
		 m1();
		 x=100;
		 System.out.println("x value is :"+x);
		
	 }
	 public static void m1()
	 {
		 System.out.println("Blank final field with default value :"+x);
	 }
}
public class StaticBlockDemo04 
{
	public static void main(String[] args) 
	{
		System.out.println(Demo03.x);
	}

}
