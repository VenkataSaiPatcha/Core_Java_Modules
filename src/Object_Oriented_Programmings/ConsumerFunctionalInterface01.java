package Object_Oriented_Programmings;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface01 
{
	public static void main(String[] args) 
	{
		Consumer<Integer> c1 = num->System.out.println("Integer type :"+num);
		c1.accept(20);
		Consumer<Boolean> c2 = num->System.out.println("Boolean  type :"+num);
		c2.accept(false);
		Consumer<CustomerInfo> c3 = id->System.out.println(id);
		c3.accept(new CustomerInfo(101));
	}

}
class CustomerInfo
{
	private int customerId;
	
	public CustomerInfo(int id)
	{
		this.customerId=id;
	}

	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + "]";
	}
	
}