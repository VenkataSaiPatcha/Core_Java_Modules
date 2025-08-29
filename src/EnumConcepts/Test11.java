package EnumConcepts;

import java.util.Scanner;

enum Colors
{
	Red, Blue, Green;
}
public class Test11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color name");
		String color = sc.next();
		Colors cls =Colors.valueOf(color);
		System.out.println(cls);
		sc.close();
	}

}
