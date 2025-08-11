package LogicalPrograms;

public class EvenAndOdd 
{
	public static void main(String[] args) 
	{
		int n=10;
//		if(n/2*2==n)
//		{
//			System.out.println("Even");
//		}
//		else
//		{
//			System.out.println("Not Even");
//		}
		
		if((n&1)==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
		int z=-100;
		System.out.println(z);
		z=-z;
		System.out.println(z);
	}

}
