package Record_Concept;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		ProductClass p1 = new ProductClass(101, "Camera");
		System.out.println(p1);
		ProductClass p2 = new ProductClass(101,"Camera");
		System.out.println(p2);
		System.out.println(p2.equals(p1));
		System.out.println(p1.getProductId()+"-------"+p1.getProductName());
		
		System.out.println(".................................................");
		
		ProductRecord prod01 = new ProductRecord(101, "Laptop");
		System.out.println(prod01);
		ProductRecord prod02 = new ProductRecord(101, "Laptop");
		System.out.println(prod02);
		System.out.println(prod02.equals(prod01));
		System.out.println(prod01.productId()+"---------"+prod01.productName());
		
	}

}
