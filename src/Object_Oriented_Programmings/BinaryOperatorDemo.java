package Object_Oriented_Programmings;
import java.util.function.BinaryOperator;
public class BinaryOperatorDemo 
{
	public static void main(String[] args) 
	{
		BinaryOperator<Integer> b1 = (a,b)->a*b;
		Integer result =b1.apply(10, 2);
		System.out.println(result);
	}

}
