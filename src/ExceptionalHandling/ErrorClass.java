package ExceptionalHandling;

public class ErrorClass 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new Error();
		}
		catch (Exception e) 
		{
			System.err.println("Catch Block");
			e.printStackTrace();
		}
	}

}
