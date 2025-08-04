package Object_Oriented_Programmings;

class Employee03
{
	protected double salary;
	public Employee03(double salary)
	{
		super();
		this.salary=salary;
	}
}
class Developer extends Employee03
{
	public Developer(double salary)
	{
		super(salary);
	}

	@Override
	public String toString() {
		return "Developer [salary=" + salary + "]";
	}
	
}
class Designer extends Employee03
{
	public Designer(double salary )
	{
		super(salary);
	}

	@Override
	public String toString() {
		return "Designer [salary=" + salary + "]";
	}
}
public class HirerarichalInheritenceDemo01 
{
	public static void main(String[] args) 
	{
		Developer dev = new Developer(10000.0);
		System.out.println(dev);
		System.out.println("--------------------------");
		Designer desgn = new Designer(25000.0);
		System.out.println(desgn);
	}

}
