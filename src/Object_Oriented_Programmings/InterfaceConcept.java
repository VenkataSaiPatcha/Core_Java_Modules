package Object_Oriented_Programmings;
/*
interface A1
{
	public String toString();
	public int hashCode();
	public boolean equals(Object obj);
}
interface B1 extends A1
{

} */

interface Drawable
{
	public String toString();
	public int hashCode();
	public boolean equals(Object obj);
}
class Draw implements Drawable
{
	@Override
	public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub
		return false;
	}
}
public class InterfaceConcept 
{
public static void main(String[] args) 
{
	Drawable d1 = new Draw();
	System.out.println(d1.hashCode());
	
}
}
