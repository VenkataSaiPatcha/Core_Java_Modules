package Object_Oriented_Programmings;

class Test02
{
	int x=100;  // step -1
	{
		x=200; // step -2
	}
	public Test02()
	{
		x=300; // step -3
	}
}
public class InstanceBlockDemo08 
{
	public static void main(String[] args) 
	{
		Test02 t1 = new Test02();
		System.out.println(t1.x);
		
	}

}
