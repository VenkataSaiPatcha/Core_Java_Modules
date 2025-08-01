package Object_Oriented_Programmings;
// In Deep copy two objects are created. The secound object will copy the the content of first object
// if we have done any modification  on the object by using reference variable only one object will be modified.
public class DeepCopy 
{
	private int productId;
	private String productName;
	
	public DeepCopy()
	{
		productId = 0;
		productName=null;
	}
	public DeepCopy(int id, String name)
	{
		this.productId=id;
		this.productName=name;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "DeepCopy [productId=" + productId + ", productName=" + productName + "]";
	}
	public static void main(String[] args) 
	{
		DeepCopy d1 = new DeepCopy(101,"Laptop");
		
		DeepCopy d2 = new DeepCopy();
		d2.setProductId(d1.getProductId());
		d2.setProductName(d1.getProductName());
		
		System.out.println("Before Modification :");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("-------------------");
		System.out.println("After modification :");
		d1.setProductId(102);
		d1.setProductName("Camera");
		System.out.println(d1);
		System.out.println(d2);
		
	}

}
