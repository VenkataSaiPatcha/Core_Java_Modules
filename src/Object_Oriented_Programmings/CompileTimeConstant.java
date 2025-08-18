package Object_Oriented_Programmings;

class Alpha012
{
	
	static
	{
		System.out.println("static Block ");
	}
	public static final int A=10;
}
class Beta012
{
	public static final int value=100;// compile time constant
	static
	{
		System.out.println("static Block");
	}
	
}
public class CompileTimeConstant {

	public static void main(String[] args) 
	{
		//System.out.println(Alpha012.A);
		System.out.println(Beta012.value); // early binding - compiler already known at the time of compile the value is already stored in a variable
	}

}
