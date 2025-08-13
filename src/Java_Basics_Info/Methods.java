package Java_Basics_Info;

public class Methods 
{
	public void deposit(double amount)
	{
		
	}
	public void doSum(int x, int y)
	{
		
	}
	public void sleep(int hrs)
	{
		//completed method
	}
	public void tasks()
	{
		// partial information(incomplete method)
	}

	public static  void main(String[] args) 
	{
		int x=100, y=200;
		int z=++x+y;
		System.out.println(z);
		System.out.println("Methods.main()");
		Demo.greet();

	}
	
}
class Demo
{
	public static void greet()
	{
		System.out.println("Good Evening To All !!!!!");
	}
}
class Integer
{
	public static int parseInt(String str)
	{
		int num=Integer.parseInt(str);
		return num;
	}
}
