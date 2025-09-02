package Record_Concept;

public record ProductRecord(Integer productId, String productName) 
{
	//to validate Outer world data (Compact constructor)
	
	public ProductRecord 
	{
		if(productId<=0)
		{
			System.out.println("Invalid Id");
		}
	}
}
