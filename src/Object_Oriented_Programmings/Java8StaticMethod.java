package Object_Oriented_Programmings;

interface Calculator
{
	static double doSquare(double  num)  // Java - 8 feacture
	{
		return num*num;
	}
	static double doCube(double num)
	{
		return num*num*num;
	}
}
public class Java8StaticMethod 
{
	public static void main(String[] args) 
	{
		System.out.println(Calculator.doSquare(10));
		System.out.println(Calculator.doCube(3));
		
	}

}
