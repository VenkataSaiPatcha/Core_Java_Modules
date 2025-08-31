package LogicalPrograms;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int num = 10;
		boolean prime = true;
		if(num<=1)
		{
			prime = false;
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
					prime = false;
				break;
			}
		}
		
		System.out.println(prime ? "prime":"Not a prime");
	}	
}
