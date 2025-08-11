package Object_Oriented_Programmings;

public class AutoBoxing 
{
	public static void main(String[] args) 
	{
		Integer i = new Integer(100);
		Integer j = new Integer(100);
		System.out.println(i==j);
		
		Integer a = Integer.valueOf(150);
		Integer b = Integer.valueOf(150);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode()+" "+b.hashCode() );
		
	}

}
