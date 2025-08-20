package Object_Oriented_Programmings;

import java.util.Scanner;
import java.util.function.Supplier;

class ProductInfo
{
	private int productId;
	private String productName;
	private double productPrice;
	public ProductInfo(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "ProductInfo [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
}
public class SupplierDemo03
{
	public static void main(String[] args) 
	{
		Supplier<ProductInfo> s1 = ()-> 
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id");
		int id = sc.nextInt();
		System.out.println("Enter the product name");
		String name=sc.next();
		System.out.println("Enter the product price");
		double price =sc.nextDouble();
		sc.close();
		return new ProductInfo(id, name, price);
		};
		
		ProductInfo p1 = s1.get();
		System.out.println(p1);
		
	}
}
