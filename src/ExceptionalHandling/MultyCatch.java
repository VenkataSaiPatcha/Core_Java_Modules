package ExceptionalHandling;

public class MultyCatch {

	public static void main(String[] args) 
	{
		System.out.println("Main method started !!");
		try
		{
			int c = 10/2;
			System.out.println("c value is :"+c);
			
			int x[] = {10,20,30,40};
			System.out.println(x[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e)
		{
			System.out.println("super class exception");
		}
		System.out.println("Main method ended !!");
	}

}
