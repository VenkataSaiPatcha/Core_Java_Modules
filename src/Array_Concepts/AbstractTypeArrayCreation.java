package Array_Concepts;

import java.util.Arrays;

abstract class Shape
{
	
}
class Square extends Shape
{
	
}
class Circle extends Shape
{
	
}
public class AbstractTypeArrayCreation
{
	public static void main(String[] args) 
	{
		Shape[] s = new Shape[2];
		s[0]=new Circle();
		s[1]=new Square();
		System.out.println(Arrays.toString(s));
	}

}
