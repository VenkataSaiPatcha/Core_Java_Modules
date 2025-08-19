package Object_Oriented_Programmings;

import java.util.Scanner;

/* If the input number is 0 or negative return -1
 * If the input number is even return square of the number
 * If the input number is even return cube of the number
 *  */
@FunctionalInterface
interface NumberChecking
{
	int accept(int num);
}
public class LambdaExpressionDemo05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int no=sc.nextInt();
		
		NumberChecking n1 = num->
		{
			if(num<=0)
				return -1;
			else if(num%2==0)
				return num*num;
			else
				return num*num*num;
			
			
		};
		System.out.println(n1.accept(no));
	}

}
