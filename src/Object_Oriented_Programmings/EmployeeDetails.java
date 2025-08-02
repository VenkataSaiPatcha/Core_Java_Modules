package Object_Oriented_Programmings;

public class EmployeeDetails 
{
	int id=100;
	public static void main(String[] args) 
	{
		int val = 200;
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.id=val;
		update(emp1);
		System.out.println(emp1.id);
		
		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.id=900;
		switchEmployee(emp2,emp1);
		System.out.println(emp1.id);
		System.out.println(emp2.id);
	}
	public static void update(EmployeeDetails e1)
	{
		e1.id=500;
		e1 = new EmployeeDetails();
		e1.id=400;
		System.out.println(e1.id);
	}
	public static void switchEmployee(EmployeeDetails e1, EmployeeDetails e2)
	{
		int temp = e1.id;
		e1.id=e2.id;
		e2= new EmployeeDetails();
		e2.id=temp;
	}
}
