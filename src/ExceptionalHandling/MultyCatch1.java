package ExceptionalHandling;

public class MultyCatch1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		try
		{
			String str  = null;
			System.out.println(str.length());
			
			String s1 = "Sai";
			int x =Integer.parseInt(s1);
			System.out.println("s1 value is :"+x);
		}
		catch(NumberFormatException | NullPointerException e)
		{
			if(e instanceof NumberFormatException)
			{
				System.err.println("number is not found");
			}
			else if(e instanceof NullPointerException)
			{
				System.err.println("Null pointer exception");
			}
		}
		System.out.println("Main method Ended");
	}
}
