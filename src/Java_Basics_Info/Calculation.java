/*Program to find out the square and cube of 
the number by following criteria
* 
a) If number is 0 or Negative it should return -1
b) If number is even It should return square of the number
c) If number is odd It should return cube of the number
*/
package Java_Basics_Info;

import java.util.Scanner;

public class Calculation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		if(num<=0)
		{
			System.out.println("Return -1");
		}
		else if(num%2==0)
		{
			System.out.println("Square of the number is :"+(num*num));
		}
		else if(num%2!=0)
		{
			System.out.println("Cube of the number is :"+(num*num*num));
		}
		
	}
}
