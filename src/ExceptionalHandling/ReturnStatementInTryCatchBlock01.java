package ExceptionalHandling;

public class ReturnStatementInTryCatchBlock01 
{
	public static void main(String[] args) 
	{
		System.out.println(m1());
		
	}
	@SuppressWarnings("finally")
	public static int m1()
	{
		try
		{
			System.out.println("Try block");
			//return 100/0;
		}
		catch(java.lang.Exception e)
		{
			e.printStackTrace();
			//return 200;
		}
		finally
		{
			System.out.println("finally block");
			return 300;
		}
	}

}
