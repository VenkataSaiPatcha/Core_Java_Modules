package Object_Oriented_Programmings;
class Shape
{
	protected int x;   // 10
	public Shape(int x)
	{
		this.x=x;
		System.out.println("x value is :"+this.x);  // 10
	}
}
class Square extends Shape
{
	public Square(int side)
	{
		super(side);
	}
	public void getAreaOfSquare()
	{
		double area = x * x;
		System.out.println("Area of square is :"+area);
	}
}
public class SuperKeyword 
{
	public static void main(String[] args) 
	{
		Square s1 = new Square(10);
		s1.getAreaOfSquare();
	}

}
