package Object_Oriented_Programmings;

public class Test
{
	String name;
	int age;
	public Test()
	{
		name="sai";
		age = 23;
		System.out.println("No - argument constructor");
	}
	public void display()
	{
		System.out.println("Name :"+name+"\n"+"Age :"+age);
	}
	public static void main(String[] args) 
	{
		Test test = new Test();
		test.display();
		
		
	}

}
