package ExceptionalHandling;

import java.util.InputMismatchException;

//If the try block does not throw any checked exception then in the corresponding
//catch block we can't handle checked exception.It will generate compilation error 
//i.e "exception never thrown from the corresponding try statement"
public class CheckedExceptionRules01
{
	public static void main(String[] args) 
	{
		/*try
		{
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		 */
		
		//  The above rule is not applicable for Unchecked Exception
		try
		{
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}

}
