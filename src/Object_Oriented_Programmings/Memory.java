package Object_Oriented_Programmings;

class Customer02
{
	private String name;
	private int id;
	public Customer02(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
public class Memory 
{
	public static void main(String[] args) 
	{
		Customer02 c1 = new Customer02("Ravi", 2);
		m1(c1);
		System.out.println(c1.getId()+" "+c1.getName());
		
	}
	public static void m1(Customer02 cust)
	{
		cust.setId(5);
		cust = new Customer02("Rahul",7);
		cust.setId(9);
		System.out.println(cust.getId()+" "+cust.getName());
	}

}
