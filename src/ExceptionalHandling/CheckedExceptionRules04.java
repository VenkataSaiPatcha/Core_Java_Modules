package ExceptionalHandling;

import java.sql.SQLException;

class Base
{
	public void show() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("super class method");
	}
}
class Derived extends Base
{
	@Override
	public void show() throws StringIndexOutOfBoundsException
	{
		System.out.println("sub class method");
	}
}
public class CheckedExceptionRules04 
{
	public static void main(String[] args) 
	{
		 System.out.println("Overridden method "
+ "may or may not throw checked exception but if it is throwing then must be same or sub class");
		
	}

}
