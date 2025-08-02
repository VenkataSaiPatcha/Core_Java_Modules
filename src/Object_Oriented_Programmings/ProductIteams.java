package Object_Oriented_Programmings;

public class ProductIteams 
{
	private int productId;
	private String productName;
	
	public ProductIteams(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public ProductIteams(ProductIteams prod)
	{
		this.productId=prod.productId;
		this.productName=prod.productName;
	}
	@Override
	public String toString() {
		return "ProductIteams [productId=" + productId + ", productName=" + productName + "]";
	}
	

}
