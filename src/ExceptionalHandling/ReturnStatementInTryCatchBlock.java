package ExceptionalHandling;

public class ReturnStatementInTryCatchBlock 
{
	public static void main(String[] args) 
	{
		System.out.println(methodReturningSomething());
	}
	public static int methodReturningSomething()
	{
		try
		{
			System.out.println("try block");
			return 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
			return 20;
		}
	}
}
