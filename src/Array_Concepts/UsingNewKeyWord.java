package Array_Concepts;

import java.util.Scanner;

class Employee01
{
	int id;
	String name;
	double salary;
	
	public Employee01(int id, String name, double salary) 
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() 
	{
		return "Employee01 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class UsingNewKeyWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		Employee01 arr[] = new Employee01[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Employee details in "+(i+1)+" index position");
			
			System.out.println("Enter the name");
			String name=sc.next();
			
			System.out.println("Enter the id");
			int id=sc.nextInt();
			
			System.out.println("Enter the salary");
			double sal=sc.nextDouble();
			
			arr[i]= new Employee01(id, name, sal);	
		}
		for(Employee01 emp : arr)
		{
			System.out.println(emp);
		}
	}

}
