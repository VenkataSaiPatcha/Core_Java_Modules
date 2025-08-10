package Java_Basics_Info;

import java.util.Scanner;

public class DigitalRoot {

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        while(n>9)
        {
        	n=sumOfDigit(n);
        }
        System.out.println("Digit Root :"+n);

	}
	
	public static int sumOfDigit(int num)
	{
			int sum=0;
			while(num!=0)
			{
				sum += num%10;
				num /=10;
				
			}
			return sum;
	}
	
}
