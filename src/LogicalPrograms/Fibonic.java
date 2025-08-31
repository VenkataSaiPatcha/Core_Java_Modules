package LogicalPrograms;

import java.util.Scanner;

public class Fibonic 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter num value");
		    int num = sc.nextInt();
		    int firstNumber = 0;
		    int secoundNUmber = 1;
		    System.out.print(firstNumber+" "+secoundNUmber);
		    for(int i=2;i<=num;i++)
		    {
		    	int result = firstNumber+secoundNUmber;
		    	firstNumber = secoundNUmber;
		    	secoundNUmber = result;
		    	System.out.print(" "+result);
		    }
		
	}

}
