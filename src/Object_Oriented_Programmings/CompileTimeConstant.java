package Object_Oriented_Programmings;

class Alpha012
{
	
	static
	{
		System.out.println("static Block ");
	}
	public static final int A=10;
}
public class CompileTimeConstant {

	public static void main(String[] args) 
	{
		System.out.println(Alpha012.A);
	}

}
