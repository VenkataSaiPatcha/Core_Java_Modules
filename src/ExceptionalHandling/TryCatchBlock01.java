package ExceptionalHandling;

public class TryCatchBlock01 
{
	public static void main(String[] args) 
	{
		try
		{
		//System.out.println(10/0);	
			throw new ArithmeticException("Dividing no by zero");
		}
		catch(Exception e)
		{
			System.err.println("Inside Catch Block");
			System.out.println(e);
		}
		
	}

}
