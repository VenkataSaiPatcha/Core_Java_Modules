package Array_Concepts;

import java.util.Arrays;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class ArrayCreationUsingObject 
{
	
	public static void main(String[] args) 
	{
		Object arr[] = {10,"Ravi",12.05,new Employee(1, "Sai"),200};
		System.out.println(Arrays.toString(arr));//1 - approach
		
		System.out.println("---------------------------------------");
		for(int i=0;i<arr.length;i++) //2 - approach
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("---------------------------------------");
		for(Object ar:arr) //3 - approach
		{
			System.out.println(ar);
		}
	}

}
