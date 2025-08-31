package LogicalQuestions;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		String str = "madam";
		String reverse=	new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
		System.out.println(str.equals(reverse) ? "Palindrome":"Not a palindrome");
		
		String str1 = "madam";
		String s1 = "";
		for(int i=str1.length()-1;i>=0;i--)
		{
			s1 = s1+str1.charAt(i);
		}
		System.out.println(s1);
		System.out.println(str1.equals(s1));
	}

}
