package Object_Oriented_Programmings;

import java.util.Arrays;

class Root01
{
	public void input(int ...x)
	{
		System.out.println(Arrays.toString(x));
	}
}
public class VarArgsDemo02 
{
	public static void main(String[] args) 
	{
		Root01 r1 = new Root01();
		r1.input(10,20,30,40,50,60);
		r1.input(200);
		r1.input(3000);
		r1.input(400000);
		
	}

}
