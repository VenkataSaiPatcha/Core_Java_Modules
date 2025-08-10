package Object_Oriented_Programmings;

import java.util.Arrays;

class Root
{
	public Root(int ...x)
	{
		System.out.println(Arrays.toString(x)+" ");
	}
}
public class VarArgsDemo01 
{
	public static void main(String... args) 
	{
		Root r1 = new Root(10,20,30,40,50,50);
		Root r2 = new Root(100);
		Root r3 = new Root(1000);
		
		
	}

}
