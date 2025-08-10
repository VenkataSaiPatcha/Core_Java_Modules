package Object_Oriented_Programmings;
class Specifications
{
	// All commented codes are invalid
	
		/*
		 * public void accept(float ...x, int ...y) { }
		 * 
		 * public void accept(int ...x, int y) { }
		 * 
		 * public void accept(int...x, int ...y) {}
		 */
		
	public void accept(int x, int...y)
	{
		System.out.println(x);
		for(int z : y)
		{
			System.out.println(z);
		}
	}
}
public class VarArgsDemo05 
{
	public static void main(String[] args) 
	{
		Specifications s1 = new Specifications();
		s1.accept(10, 100,200,300,400,500,600,70);
	}

}
