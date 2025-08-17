package Object_Oriented_Programmings;

abstract class Shape04
{
	protected String shapeType;
	public Shape04(String shapeType)
	{
		this.shapeType = shapeType;
	}
	public abstract void draw();
}
class Rectangle04 extends Shape04
{
	public Rectangle04(String shapeType)
	{
		super(shapeType);
	}
	@Override
	public void draw() 
	{
		System.out.println("Rectangle class is drawing :"+shapeType);
	}
}
class Circle04 extends Shape04
{
	public Circle04(String shapeType)
	{
		super(shapeType);
	}
	public void draw()
	{
		System.out.println("Circle class is drawing :"+shapeType);
	}
}
public class AbstractClassDemo03
{
	public static void main(String[] args) 
	{
		Shape04 s1 = null;
		s1 = new Rectangle04("Rectangle");
		System.out.println(s1.shapeType);
		s1.draw();
		s1 = new Circle04("Circle");
		System.out.println(s1.shapeType);
		s1.draw();
		
	}

}
