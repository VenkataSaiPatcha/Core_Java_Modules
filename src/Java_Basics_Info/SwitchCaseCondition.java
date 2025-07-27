package Java_Basics_Info;

import java.util.Scanner;

public class SwitchCaseCondition 
{
	public static void main(String[] args) 
	{
		System.out.println("\t\t**Main menu**\n");
		System.out.println("\t\t**100 Police**\n");
		System.out.println("\t\t**101 Fire**\n");
		System.out.println("\t\t**102 Ambulance**\n");
		System.out.println("\t\t**139 Railway**\n");
		System.out.println("\t\t**181 Women's Helpline**\n");
		
		System.out.println("Enter your choice :");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 100:
			System.out.println("Police Services");
			break;
		case 101:
			System.out.println("Fire Services");
			break;
		case 102:
			System.out.println("Ambulance Service");
			break;
		case 139:
			System.out.println("Railway Services");
			break;
		case 181:
			System.out.println("Women's Helpline Services");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
	}

}
