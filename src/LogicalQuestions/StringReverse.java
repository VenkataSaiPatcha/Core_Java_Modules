package LogicalQuestions;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String str = "Hello";

		String s1 =new StringBuilder(str).reverse().toString();
		System.out.println(s1);
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			System.out.print(str.charAt(i));
		}
	}

}
