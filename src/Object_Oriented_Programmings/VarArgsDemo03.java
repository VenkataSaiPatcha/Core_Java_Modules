package Object_Oriented_Programmings;
class AddParameters
{
	int sum = 0;
	public void doSum(int ...values)
	{
		
		for(int value: values)
		{
			sum += value;
		}
		System.out.println("Sum of values :"+sum);
	}
}
public class VarArgsDemo03 
{
	public static void main(String[] args) 
	{
		AddParameters a1 = new AddParameters();
		a1.doSum(10,20,30,40,50,60,80);
		a1.doSum(100,200,300,400,500,600,700);
	}

}
