package EnumConcepts;

enum MySeasons
{
	SPRING("pleasant"), SUMMER("un pleasant"), RAINY("Rain"), WINTER;
	String msg;
	
	private MySeasons(String msg)
	{
		this.msg = msg;
	}
	
	private MySeasons()
	{
		this.msg = "Cold";
	}
	public String getMessage()
	{
		return msg;
	}
}
public class Test10 
{
	public static void main(String[] args) 
	{
			MySeasons my[]=MySeasons.values();
			
			for(MySeasons ss:my)
			{
				System.out.println(ss+" is "+ss.getMessage());
				System.out.println(ss+" ordinal position is :"+ss.ordinal());
				System.out.println("Season name is :"+ss.name());
				System.out.println("---------------------------------------");
			}
			
	}

}
