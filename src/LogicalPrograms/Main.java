package LogicalPrograms;
import java.util.Scanner;
public class Main 
{
    public static int factorial(int n)
    {
        if(n==0 || n==1)
        return 1;
        return n*factorial(n-1);
    }
    
    public static int factorialRecursive(int n)
    {
    	int result = 1;
    	for(int i=1;i<=n;i++)
    	{
    		result = result*i;
    	}
    	return result;
    }
    
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num value");
    int num = sc.nextInt();
       int result = factorial(num);
       System.out.println("Factorial of "+num+" is "+result);
       System.out.println("Factorial of "+num+" in reccursive is :"+factorialRecursive(num));
    }
}