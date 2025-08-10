package Object_Oriented_Programmings;

class MyClass extends Thread
{
	public void run()   
	{
		int a = 10;   // stored in stack area
		int b = 20;
		System.out.println(a+b);
	}
}
public class RuntimeStack 
{
	public static void main(String[] args) 
	{
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		
		m1.run();
		m1.start();
		m2.start();
	}

}
