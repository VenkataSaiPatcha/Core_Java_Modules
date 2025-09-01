package ExceptionalHandling;

class SuperClass
{
	public void show() 
	{
		System.out.println("Super class method with unchecked exception");
	}
}
class SubClass extends SuperClass
{
	@Override
	public void show() //throws ClassNotFoundException 
	{
		System.out.println("Sub class method with checked exception it gives error");
	}
}

public class CheckedExceptionRules03 
{
	public static void main(String[] args) 
	{
			
	}

}
