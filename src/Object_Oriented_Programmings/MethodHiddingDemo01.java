package Object_Oriented_Programmings;

class DeltaClass
{
	public static void m1()
	{
		System.out.println("Delta class static methos");
	}
}
class LambdaClass extends DeltaClass
{
/*	public static void m1()
	{
		System.out.println("Lambda class static method"); //method hiding
	} */
}
public class MethodHiddingDemo01 
{
	public static void main(String[] args) 
	{
		LambdaClass.m1();
		LambdaClass d1 = new LambdaClass();
		d1.m1();
		
	}

}
