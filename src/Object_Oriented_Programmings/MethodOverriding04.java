package Object_Oriented_Programmings;

class Shape01
{
	public void draw()
	{
		System.out.println("shape is drawn");
	}
}
class Rectangle01 extends Shape01
{
	@Override
	public void draw()
	{
		System.out.println("rectangle is drawn");
	}
}
class square extends Shape01
{
	@Override
	public void draw() 
	{
		System.out.println("square shape is drawn");
	}
}
public class MethodOverriding04 
{
	public static void main(String[] args) 
	{
		Shape01 s1 = null;
		s1 = new Rectangle01();
		s1.draw();
		
		s1 = new square();
		s1.draw();
	}

}
