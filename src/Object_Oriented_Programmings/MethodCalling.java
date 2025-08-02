package Object_Oriented_Programmings;

public class MethodCalling
{
	int x;
	int y;
	public void m1(MethodCalling m)
	{
		x=x+1;
		y=y+2;
		m.x=m.x+3;
		m.y=m.y+4;
		
	}
	public static void main(String[] args) 
	{
		MethodCalling m1 = new MethodCalling();
		MethodCalling m2 = new MethodCalling();
		
		m1.m1(m2);
		System.out.println(m1.x+" "+m1.y);
		System.out.println(m2.x+" "+m2.y);
	    
		System.out.println("                  ");
		
		m2.m1(m1);
		System.out.println(m2.x+" "+m2.y);
		System.out.println(m1.x+" "+m1.y);
		
		System.out.println("                  ");
		
		m1.m1(m1);
		System.out.println(m1.x+" "+m1.y);
		System.out.println(m2.x+" "+m2.y);
		
		System.out.println("                  ");
		
		m2.m1(m2);
		System.out.println(m1.x+" "+m1.y);
		System.out.println(m2.x+" "+m2.y);
	}

}
