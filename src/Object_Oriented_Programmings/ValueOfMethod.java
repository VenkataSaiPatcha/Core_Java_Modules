package Object_Oriented_Programmings;
//Integer.valueOf(String str)
//Integer.valueOf(String str, int radix/base)
public class ValueOfMethod 
{
	public static void main(String[] args) 
	{
			Integer i=Integer.valueOf(15);
			Integer j = Integer.valueOf("20");
			Integer radix=Integer.valueOf("1100",2);
			
			System.out.println(i);
			System.out.println(j);
			System.out.println(radix);
	}

}
