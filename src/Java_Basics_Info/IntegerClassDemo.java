package Java_Basics_Info;
//How exactly Integer.parseInt works internally
class Integer01
{
	public static int getSquare(int num)
	{
		return num*num;
	}
	public static int getSum(int num)
	{
		return num+num;
	}
}
public class IntegerClassDemo 
{
	public static void main(String[] args) 
	{
		int square=Integer01.getSquare(10);
		System.out.println("Square is :"+square);
		
		int sum=Integer01.getSum(20);
		System.out.println("Sum is :"+sum);
		
	}

}
