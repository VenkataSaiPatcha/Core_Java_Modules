package Object_Oriented_Programmings;
//Auto-Boxin(primitive to wrapper object)
public class WrapperClass
{
	public static void main(String[] args) 
	{
		int x = 10;
		Integer num=Integer.valueOf(x);  // Upto JDK 1.4 developer is responsible to convert primitive to wrapper object
		System.out.println(num);
		
		System.out.println();
		int y = 200;
		Integer z = y;
		System.out.println(z); // from JDK 1.5 onward directly we can assign primitive to wrapper object
	}

}
