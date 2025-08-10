package Object_Oriented_Programmings;

import java.util.Scanner;

public class Trainer 
{
	 
	public static void viewStudentProfile(Student06 obj)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id value :");
		int id = sc.nextInt();
		if(id==obj.getStudentId())
		{
			System.out.println(obj);
		}
		else
		{
			System.out.println("Invalid id value !!");
		}
		sc.close();
	}

}
