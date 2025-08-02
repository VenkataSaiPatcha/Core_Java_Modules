package Object_Oriented_Programmings;

public class CopyConstructor 
{
	
	public static void main(String[] args) 
	{
		EmployeeClass emp = new EmployeeClass(101, "Sai");
		ManagerClass mng = new ManagerClass(emp);
		System.out.println(mng);
		System.out.println(emp);
	}
	
	

}
