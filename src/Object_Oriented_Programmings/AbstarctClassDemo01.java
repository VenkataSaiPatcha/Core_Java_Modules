package Object_Oriented_Programmings;

abstract class Shape03
{
	public abstract void draw();
}
class Circle03 extends Shape03
{
	@Override
	public void draw() 
	{
		System.out.println("circle is drawn");
	}
}
class Square03 extends Shape03
{
	@Override
	public void draw() 
	{
		System.out.println("square is drawn");
		
	}
}
public class AbstarctClassDemo01
{
	public static void main(String[] args) 
	{
		Shape03 s1 = null;
		s1 = new Circle03(); s1.draw();
		s1 = new Square03(); s1.draw();
	}

}
