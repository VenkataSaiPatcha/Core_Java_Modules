package Array_Concepts;

import java.util.Arrays;

interface Shape01
{
	
}
class Square01 implements Shape01
{
	
}
class Circle01 implements Shape01
{
	
}
public class InterfaceArrayCreation 
{
	public static void main(String[] args) 
	{
		Shape01 shape[]=new Shape01[2];
		shape[0]=new Square01();
		shape[1]=new Circle01();
		System.out.println(Arrays.toString(shape));
		
	}

}
