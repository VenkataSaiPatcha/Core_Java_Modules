package Java_Basics_Info;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		if(isPrime(9))
		{
			System.out.println("it is prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
		
	}
	public static boolean isPrime(int num)
	{
		if(num<=1) return false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i ==0)
			{
				return false;
			}
			
		}
		return true;
	}
}
