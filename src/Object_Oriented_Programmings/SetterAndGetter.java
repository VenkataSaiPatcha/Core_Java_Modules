package Object_Oriented_Programmings;

public class SetterAndGetter 
{
	private double employeeSalary;

	public SetterAndGetter(double employeeSalary) 
	{
		super();
		this.employeeSalary = employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) 
	{
		this.employeeSalary = employeeSalary;
	}
		
	public double getEmployeeSalary() 
	{
		return this.employeeSalary;
	}
	
	@Override
	public String toString() {
		return "SetterAndGetter [employeeSalary=" + employeeSalary + "]";
	}

	public static void main(String[] args) 
	{
		SetterAndGetter sg = new SetterAndGetter(1000.0);
		System.out.println(sg); // Internally the SOP statement calls toString() method
		
	}

}
