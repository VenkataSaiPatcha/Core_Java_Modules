package LogicalPrograms;

public class RemovingDuplicatesInAString 
{
	public static void main(String[] args) 
	{
		String str = "programming";
		String result  = "";
		for(int i=0;i<str.length();i++)
		{
			char c =str.charAt(i);
			
			boolean found = false;
			System.out.println(result.length());
			for(int j=0;j<result.length();j++)
			{
				if(c==result.charAt(j))
				{
					found = true;
					break;
				}
			}
			if(!found)
			{
				result = result+c;
			}
			
			
		}
		System.out.println(result);
	}

}
