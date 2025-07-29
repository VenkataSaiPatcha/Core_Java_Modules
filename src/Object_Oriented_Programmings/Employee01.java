package Object_Oriented_Programmings;
//Initializing the instance variable using parameter variable as per requirement :
public class Employee01 
{
	int employeeId;
    String employeeName;
    double employeeSalary;   
    char employeeGrade;
    
    public void setEmployeeData(int id, String name, double salary)
    {
    	this.employeeId=id;
    	this.employeeName=name;
    	this.employeeSalary=salary;
  
    }
    public void calculateEmployeeGrade()
    {
    	if(employeeSalary>=90000)
    	{
    		employeeGrade='A';
    	}
    	else if(employeeSalary>=80000)
    	{
    		employeeGrade='B';
    	}
    	else if(employeeSalary>=70000)
    	{
    		employeeGrade='C';
    	}
    	else if(employeeSalary>=60000)
    	{
    		employeeGrade='D';
    	}
    	else
    	{
    		employeeGrade='E';
    	}
    }
    
    public void getEmployeeData()
    {
    	System.out.println("Employee Id is :"+employeeId);
    	System.out.println("Employee Name is :"+employeeName);
    	System.out.println("Employee Salary is :"+employeeSalary);
    	System.out.println("Employee Grade is :"+employeeGrade);    
    } 
    
	public static void main(String[] args) 
	{
		Employee01 employee = new Employee01();
		employee.setEmployeeData(101, "Sai",75000.0);
		employee.getEmployeeData();
		
	}

}
