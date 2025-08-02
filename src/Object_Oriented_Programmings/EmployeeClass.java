package Object_Oriented_Programmings;

public class EmployeeClass 
{
	private int employeeId;
	private String employeeName;
	public EmployeeClass(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	@Override
	public String toString() {
		return "EmployeeClass [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	

}
