package Object_Oriented_Programmings;
// Java does not support pointers, so java only works with pass by value
// pass by value means we are sending the copy of original data to method
public class PassByValue 
{
	public static void main(String[] args) 
	{
		int x = 100;
		accept(x);
		System.out.println(x);
	}
	public static void accept(int y)
	{
		y=200;
	}

}
