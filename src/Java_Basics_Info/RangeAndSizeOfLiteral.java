package Java_Basics_Info;
import java.lang.Integer;
import java.lang.Float;
public class RangeAndSizeOfLiteral 
{
	public static void main(String[] args) 
	{
		//The ranges and sizes of Integeral Data type
		System.out.println("\n Byte range:");
		System.out.println(" min: " + Byte.MIN_VALUE);
		System.out.println(" max: " + Byte.MAX_VALUE);
		System.out.println(" size :"+Byte.SIZE);
 
		System.out.println("\n Short range:");
		System.out.println(" min: " + Short.MIN_VALUE);
		System.out.println(" max: " + Short.MAX_VALUE);
		System.out.println(" size :"+Short.SIZE);

		System.out.println("\n Integer range:");
		System.out.println(" min: " + Integer.MIN_VALUE);
		System.out.println(" max: " + Integer.MAX_VALUE);
		System.out.println(" size :"+Integer.SIZE);

		System.out.println("\n Long range:");
		System.out.println(" min: " + Long.MIN_VALUE);
		System.out.println(" max: " + Long.MAX_VALUE);
		System.out.println(" size :"+Long.SIZE);
		
		//Range and size of floating point literal 
		System.out.println("\n Float range:");
		System.out.println(" min: " + Float.MIN_VALUE);
		System.out.println(" max: " + Float.MAX_VALUE); 
		System.out.println(" size :"+Float.SIZE);

		System.out.println("\n Double range:");
		System.out.println(" min: " + Double.MIN_VALUE);
		System.out.println(" max: " + Double.MAX_VALUE);
		System.out.println(" size :"+Double.SIZE);
		
		//Range and size of Character literal
		System.out.println(Character.MIN_VALUE); 
		System.out.println(Character.MAX_VALUE); 
		System.out.println(Character.SIZE); 
	}

}
