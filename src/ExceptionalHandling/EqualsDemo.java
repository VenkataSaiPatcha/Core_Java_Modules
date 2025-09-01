package ExceptionalHandling;

import java.util.Objects;

class Employee extends Object 
{
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName);
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
