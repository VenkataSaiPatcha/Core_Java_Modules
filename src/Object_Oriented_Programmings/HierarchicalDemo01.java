package Object_Oriented_Programmings;

import java.text.DecimalFormat;
import java.util.Scanner;

class Shapes
{
	protected int x;    // radius value  // length value
	public Shapes(int x)
	{
		this.x=x;
		System.out.println("x value is :"+x);
	}
}
class Circle extends Shapes
{
	final double PI = 3.14;
	public Circle(int radius)
	{
		super(radius);
	}
	public void areaOfCircle()
	{
		double area = PI*this.x*this.x;
		DecimalFormat df = new DecimalFormat("000.000");
		System.out.println("Area of circle :"+df.format(area));
	}
}
class Rectangle extends Shapes
{
	protected int bredth;
	public Rectangle(int length, int bredth)
	{
		super(length);
		this.bredth=bredth;
	}
	public void areaOfRectangle()
	{
		double area=super.x * this.bredth;
		System.out.println("Area of Rectangle :"+area);
	}
}
public class HierarchicalDemo01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		int radius =sc.nextInt();
		
		Circle circle = new Circle(radius);
		circle.areaOfCircle();
		
		System.out.println("------------------------------------");
		
		System.out.println("Enter the length of the rectangle :");
		int length =sc.nextInt();
		int bredth = sc.nextInt();
		Rectangle rect = new Rectangle(length, bredth);
		rect.areaOfRectangle();
		sc.close();
	}

}
