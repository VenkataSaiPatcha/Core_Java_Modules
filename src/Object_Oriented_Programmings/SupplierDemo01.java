package Object_Oriented_Programmings;

import java.util.function.Supplier;

public class SupplierDemo01 
{
	public static void main(String[] args) 
	{
		Supplier<String> s1 = ()-> 100+100+"Sai"+80+80;
		System.out.println(s1.get());
		
	}

}
