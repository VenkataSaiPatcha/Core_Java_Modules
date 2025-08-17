package LogicalPrograms;

class Alpha05
{
	int x=100;
	public Alpha05()
	{
		System.out.println("Alpha class constructor"+x);
	}
	private final void accept()
	{
		 System.out.println("Alpha class");
	}
}
class Beta05 extends Alpha05
{
	int y=200;
	public Beta05()
	{
		System.out.println("Beta class constructor"+y);
	}
	public void accept()
	{
		System.out.println("Beta class");
	}
}
public class FinalMethod 
{
	public static void main(String[] args) 
	{
		
		new Beta05().accept();
	}

}
