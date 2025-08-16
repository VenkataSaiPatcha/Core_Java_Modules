package LogicalPrograms;


import java.util.Scanner;
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
       int n=sc.nextInt();
      
        ReverseNumber rs = new ReverseNumber();
        
        System.out.println(rs.reverseNumber(n));
    }
    public int reverseNumber(int x)
    {
         long sum=0;
        		 int r=0;
        while (x!=0) 
        {
        	r=x%10;
            sum = sum*10+r;
            x=x/10;  
        }
        if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE)
        {
            return 0;
        }
        return (int) sum;
    }
    
}