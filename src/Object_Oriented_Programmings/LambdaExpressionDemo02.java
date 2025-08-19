package Object_Oriented_Programmings;

interface Length
{
	
	int getLength(String str);
}
public class LambdaExpressionDemo02 
{
	public static void main(String[] args) 
	{
		
		Length l = str->str.length();

		System.out.println("length of str :"+l.getLength("India"));
		
	}

}
