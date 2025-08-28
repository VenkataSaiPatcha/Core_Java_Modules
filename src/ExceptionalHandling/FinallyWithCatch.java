package ExceptionalHandling;

public class FinallyWithCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			System.exit(0);
			int arr[] = new int[-5];
			arr[0] = 10;
			arr[1] = 20;
			System.out.println(arr[0]+" "+arr[1]);
			
		}
		catch(NegativeArraySizeException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Resources are handled here");
		}
		
	}

}
