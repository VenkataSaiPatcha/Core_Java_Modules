package Java_Basics_Info;

import java.util.Scanner;

class Circle
{
	public static String getAreaOfCircle(int radius)
	{
		if(radius<=0)
		{
			return ""+(-1);
		}
		else
		{
			final double PI=3.14;
			double area=PI*radius*radius;
			return "areaOfCircle "+area;
		}
	}
}
public class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int num=sc.nextInt();
		
		String areaOfCircle=Circle.getAreaOfCircle(num);
		System.out.println(areaOfCircle);
		sc.close();
	}

}
