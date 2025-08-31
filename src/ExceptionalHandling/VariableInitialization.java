package ExceptionalHandling;

public class VariableInitialization 
{
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		int x; // declaration
		try
		{
			 x=100; // local variable initialization
			System.out.println(x);
		}
		catch(Exception e)
		{
		 x=200;
			System.out.println(x);
			e.printStackTrace();
		}
		System.out.println("main method ended");
		
		
	}

}
