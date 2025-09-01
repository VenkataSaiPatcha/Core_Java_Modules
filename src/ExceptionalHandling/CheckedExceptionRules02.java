package ExceptionalHandling;

import java.sql.SQLException;
//If the try block does not throw any exception then in the corresponding catch block we can write Exception OR Throwable because
//both are the super classes for all types of Exception whether it is checked or unchecked.
public class CheckedExceptionRules02
{
	public static void main(String[] args) 
	{
		try
		{
			
		}
		catch(Throwable e) 
		{
			e.printStackTrace();
		}
		
	}

}
