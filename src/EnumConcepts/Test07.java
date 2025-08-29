package EnumConcepts;


public class Test07 
{
	enum Weeks
	{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	}
	public static void main(String[] args) 
	{
			Weeks week[]=	Weeks.values();
			
			for(Weeks ww: week)
			{
				System.out.println(ww.name()+" ordinal position is :"+ww.ordinal());
			}
	}

}
