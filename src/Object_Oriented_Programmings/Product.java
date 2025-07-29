package Object_Oriented_Programmings;

import java.util.Scanner;

public class Product 
{
	String laptop_Brand;
	double laptop_Price;
	boolean is_TouchScreen;
	
	public void getLaptopInformation()
	{
		System.out.println("Laptop Brand is :"+laptop_Brand);
		System.out.println("Laptop Price is :"+laptop_Price);
		System.out.println("Is laptop touch screen ?:"+is_TouchScreen);
	}
	public static void main(String[] args) 
	{
		//Initializing the object properties using object reference
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the laptop brand :");
			product.laptop_Brand=sc.nextLine();
			
			System.out.println("Enter the laptop price :");
			product.laptop_Price=sc.nextDouble();
			
			System.out.println("Is it touch screen laptop :");
			product.is_TouchScreen=sc.nextBoolean();
		
			product.getLaptopInformation();
			sc.close();
	}

}
