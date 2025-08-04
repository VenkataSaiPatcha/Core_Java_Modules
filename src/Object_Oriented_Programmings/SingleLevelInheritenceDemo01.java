package Object_Oriented_Programmings;

class TemporaryEmployee
{
	protected int employeeId;
	protected String employeeName;
	protected String employeeAddress;
	
	public TemporaryEmployee(int employeeId, String employeeName, String employeeAddress) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	
	
}
class PermenantEmployee extends TemporaryEmployee
{
	protected String departement;
	protected String designation;
	
	public PermenantEmployee(int employeeId, String employeeName, String employeeAdrs, String departement, String designation) 
	{
		super(employeeId,employeeName,employeeAdrs);
		this.departement = departement;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "PermenantEmployee [departement=" + departement + ", designation=" + designation + ", employeeId="
				+ employeeId + ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + "]";
	}
		
}
public class SingleLevelInheritenceDemo01 
{
	public static void main(String[] args) 
	{
		PermenantEmployee p1 = new PermenantEmployee(101, "Sai", "Kondapur","Java","Backend_Developer");
		
		System.out.println(p1);
	}

}
