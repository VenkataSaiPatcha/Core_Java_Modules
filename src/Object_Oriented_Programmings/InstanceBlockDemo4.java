package Object_Oriented_Programmings;
class Student01
{
	public Student01()
	{
		this(10,20);
		
		System.out.println("No Argument constructor");
	}
	public Student01(int x, int y)
	{
		System.out.println("Parameterized constructor");
	}
	{
		System.out.println("Object creation is in process :");
	}
}
public class InstanceBlockDemo4 
{
	public static void main(String[] args) 
	{
		new Student01();
		System.out.println("--------------------");
		new Student01(10, 20);
		System.out.println("--------------------");
		new Student01();
		
	}

}
