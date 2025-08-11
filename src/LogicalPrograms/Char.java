package LogicalPrograms;

public class Char 
{
	public static void main(String[] args) 
	{
		
//		if(ch>='A' && ch<='Z')
//		{
//			int i=ch;
//			System.out.println("it is Higher case :"+i);
//		}
		char ch='d';
		if(ch>='a' && ch<='z')
		{
			int i=ch;
			System.out.println("lower case :"+i);
		}
		if(!(ch>='a' && ch>='z'))
		{
			System.out.println("not a lower case");
		}
		
	}

}
