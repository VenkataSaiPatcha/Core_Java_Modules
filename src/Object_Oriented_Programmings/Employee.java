package Object_Oriented_Programmings;

public class Employee 
{
	   int employeeId;
	   String employeeName;
	   double employeeSalary;
	   String employeeAddress;
	   
	   public void setEmployeeData(int id, String name, double salary, String address)
	   {
		   this.employeeId=id;
		   this.employeeName=name;
		   this.employeeSalary=salary;
		   this.employeeAddress=address;
	   }
	   public void getEmployeeData()
	   {
		   System.out.println("Id :"+employeeId);
		   System.out.println("Name :"+employeeName);
		   System.out.println("Salary :"+employeeSalary);
		   System.out.println("Address :"+employeeAddress);
	   }
	   
	public static void main(String[] args) 
	{
		Employee employee = new Employee();
		
		employee.setEmployeeData(101, "sai", 32000.0, "kondapur");
		employee.getEmployeeData();
		
		System.out.println("================");
		Employee smith = new Employee();
		smith.setEmployeeData(222, "Smith", 56000, "Ameerpet");
		smith.getEmployeeData();
		
	}

}
