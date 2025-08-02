package Object_Oriented_Programmings;

public class CopyConstructor01 
{
	public static void main(String[] args) 
	{
		ProductIteams prod1 = new ProductIteams(101, "MacBook");
		ProductIteams prod2 = new ProductIteams(prod1); // copy constructor
		System.out.println(prod1);
		System.out.println(prod2);
		
	}

}
