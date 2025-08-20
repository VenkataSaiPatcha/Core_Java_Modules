package Object_Oriented_Programmings;
import java.util.Scanner;
import java.util.function.BiConsumer;
public class BiConsumer01 
{
	public static void main(String[] args) 
	{
		BiConsumer<Integer,String> b1 = (x,str)->
		{
			x = x*10;
			str = str.concat("Sai");
			System.out.println("x value is :"+x+"-------"+"str value is :"+str);
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value");
		int x =sc.nextInt();
		System.out.println("Enter str value");
		String str =sc.next();
		sc.close();
			b1.accept(x, str);
	}

}
