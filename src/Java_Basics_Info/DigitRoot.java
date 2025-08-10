package Java_Basics_Info;

import java.util.Scanner;

public class DigitRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
    
        // Just printing sum mod 9 + 1 to simulate digital root
        int digitalRoot = (n==0) ? 0 : 1 + (n - 1) % 9;
        System.out.println(digitalRoot);
		
	}

}
