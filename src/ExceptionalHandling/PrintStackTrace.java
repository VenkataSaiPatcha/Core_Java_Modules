package ExceptionalHandling;

public class PrintStackTrace 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started !!");
		try
		{
			String str = "Venkata_Sai";
			int value = Integer.parseInt(str);
			System.out.println(value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("---------------------------");
			System.out.println(e.getMessage());
			System.out.println("-------------------------------");
			System.out.println(e.toString());
		}
		System.out.println("Main method ended");
	}

}
