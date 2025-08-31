package String_Concepts;

public class Demo 
{
	public static void main(String[] args) 
	{
		String str="Hello";
//		int value=Integer.valueOf(str);
//		System.out.println(value);
		
//		int num =Integer.parseInt(str);
//		System.out.println(num);
		
			char ch[] = str.toCharArray();
			for(char c: ch)
			{
				Integer value=Integer.valueOf(c);
				System.out.print(value+" ");
			}
		
	}

}
