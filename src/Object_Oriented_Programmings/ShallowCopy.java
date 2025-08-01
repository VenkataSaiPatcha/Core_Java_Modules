package Object_Oriented_Programmings;
//one object will be created and same object reference variable will be refered 
//to multiple reference variables is called shallow copy. 
public class ShallowCopy 
{
	private String productBrand;
	private double productPrice;
	
	public ShallowCopy(String brand,double price)
	{
		super();
		this.productBrand=brand;
		this.productPrice=price;
	}
	public void set(String productBrand)
	{
		this.productBrand=productBrand;
	}
	public String getProductBrand()
	{
		return productBrand;
	}
	public void setProductPrice(double productPrice)
	{
		this.productPrice=productPrice;
	}
	public double getProductPrice()
	{
		return productPrice;
	}
	
	@Override
	public String toString() 
	{
		return "ShallowCopy [productBrand=" + productBrand + ", productPrice=" + productPrice + "]";
	}
	public static void main(String[] args) 
	{
		ShallowCopy s1 = new ShallowCopy("Laptop", 71000.0);
		System.out.println(s1);
		System.out.println("---------------------------");
		ShallowCopy s2 = s1;
		s2.set("Camera");
		s2.setProductPrice(45000.0);
		System.out.println(s1);
		System.out.println(s2);
	}

}
