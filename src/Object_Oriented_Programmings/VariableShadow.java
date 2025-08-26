package Object_Oriented_Programmings;

public class VariableShadow 
{
	int id=100;   //Instance variables
	String name="sai"; //Instance variables
	
	public void accept()
	{
		int id=200;
		String name="Ravi";
		System.out.println("Id :"+id+"\n"+"Name :"+name);
	}
	public void input(int id, String name)
	{
		System.out.println("Id :"+id+"\n"+"Name :"+name);
	}
	public static void main(String[] args) 
	{
		VariableShadow var = new VariableShadow();
		var.accept();
		var.input(300,"John");
		
	}

}
