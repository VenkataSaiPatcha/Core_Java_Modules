package EnumConcepts;

public class Test03 
{
	enum Color
	{
		Red, Blue, Green;
	}
	public static void main(String[] args) 
	{
		Color c1= Color.Red;
		Color c2 = Color.Red;
		
		if(c1==c2)
		{
			System.out.println("== operator");
		}
		if(c1.equals(c2))
		{
			System.out.println("equals(object) operator");
		}
	}

}
