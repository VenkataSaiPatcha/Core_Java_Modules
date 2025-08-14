package String_Concepts;

public class StringClass
{
	public static void main(String[] args) 
	{
		String s1 = "apple  banana//scarrot  mango";
		String[] str=s1.split("//s");
		for(String ss:str)
		{
			System.out.println(ss);
		}
	}

}
