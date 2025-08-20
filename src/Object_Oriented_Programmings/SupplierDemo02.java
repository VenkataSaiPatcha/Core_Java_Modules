package Object_Oriented_Programmings;

import java.util.function.Supplier;

class EmployeeData
{
	private int employeeId;
	private String employeeName;
	
	public EmployeeData(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "EmployeeData [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
}
public class SupplierDemo02 
{
	public static void main(String[] args) 
	{
		Supplier<EmployeeData> s1 = ()-> new EmployeeData(101, "Sai");
		
		EmployeeData obj = s1.get();
		System.out.println(obj);
	}

}
