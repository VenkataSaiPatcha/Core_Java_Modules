package Object_Oriented_Programmings;

public class ManagerClass 
{
	private int managerId;
	private String managerName;
	
	public ManagerClass(EmployeeClass emp) 
	{
		this.managerId = emp.getEmployeeId();
		this.managerName = emp.getEmployeeName();
	}

	@Override
	public String toString() {
		return "ManagerClass [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
	
	
	

}
