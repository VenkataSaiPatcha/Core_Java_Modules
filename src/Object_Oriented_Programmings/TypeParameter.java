package Object_Oriented_Programmings;

class Accept<T>
{
	private T data;
	public Accept(T data)
	{
		this.data=data;
	}
	public T getData()
	{
		return data;
	}
}
public class TypeParameter 
{
	public static void main(String[] args) 
	{
		Accept<Double> accept = new Accept<Double>(30.0);
		System.out.println(accept.getData());
		
		Accept<Integer> a1 = new Accept<Integer>(100);
		System.out.println(a1.getData());
		
		Accept<Boolean> a2 = new Accept<Boolean>(false);
		System.out.println(a2.getData());
		
		Accept<ProductDetails> a3 = new Accept<ProductDetails>(new ProductDetails(101, "Sai"));
		System.out.println(a3.getData());
	}

}
class ProductDetails
{
	private int productId;
	private String productName;
	
	public ProductDetails(int id,String name)
	{
		this.productId=id;
		this.productName=name;
	}
	public void setProductId(int id)
	{
		this.productId=id;
	}
	public int getProductId(int id)
	{
		return id;
	}
	public void setProductName(String name)
	{
		this.productName=name;
	}
	public String getProductDetails(String name)
	{
		return name;
	}
	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + "]";
	}
	
}



