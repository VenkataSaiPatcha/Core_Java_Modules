package ExceptionalHandling;

class Employee extends Object 
{
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}	
}
public class EqualsDemo 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(101, "Sai");
		Employee emp1 = new Employee(101, "Sai");
		System.out.println(emp == emp1);
		System.out.println(emp.equals(emp1));
	}

}
