package LogicalPrograms;

public class FirstNonRepeating 
{
	public static void main(String[] args) 
	{
		String str = "swiss";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.println("First non repeated character ::"+ch);
				return;
			}
			else
			{
				System.out.println("No element was found");
			}
		}
		
		
		
	}

}
