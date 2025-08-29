package EnumConcepts;

public class Test12 
{
	enum Weeks
	{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}
	public static void main(String[] args) 
	{
		Weeks wek = Weeks.Saturday;
		
		switch(wek)
		{
		case Sunday:System.out.println("sunday");
		break;
		case Monday:System.out.println("monday");
		break;
		default : System.out.println("other day");
		}
	}

}
