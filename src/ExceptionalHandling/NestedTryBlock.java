package ExceptionalHandling;

public class NestedTryBlock
{
	public static void main(String[] args) 
	{
		try
		{
			String s1 = null;
			System.out.println("string length is :"+s1.length());
			try
			{
				String s2 = "sai";
				int num = Integer.parseInt(s2);
				System.out.println(num);
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}

}
