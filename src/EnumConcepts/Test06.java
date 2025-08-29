package EnumConcepts;

public class Test06
{
	enum Season
	{
		Summer, Winter, Rainy;
	}
	public static void main(String[] args) 
	{
		Season season[]=Season.values();
		for(Season str : season)
		{
			System.out.println(str);
		}
	}

}
