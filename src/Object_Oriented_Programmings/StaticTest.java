package Object_Oriented_Programmings;

class Super03
{
	protected int x = 100;
}
class Sub03 extends Super03
{
	protected int x = 200;
	
	public static  void greet()
	{
		Sub03 sub = new Sub03();  //  object is eligible to garbage collector when method execution completed
		System.out.println(sub.x);
		
		Super03 sup = sub;
		System.out.println(sup.x);
	}
}
public class StaticTest 
{
	public static void main(String[] args) 
	{
		Sub03.greet();
	}

}
