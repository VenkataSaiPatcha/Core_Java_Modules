package Object_Oriented_Programmings;

class Alpha05
{
	int val;
	static int sval = 200;
	static HeapAndStackFlow hs = new HeapAndStackFlow();
	
	public Alpha05(int val)
	{
		this.val=val;
	}
}
public class HeapAndStackFlow 
{
	public static void main(String[] args) 
	{
		Alpha05 a1 = new Alpha05(10);
		Alpha05 a2 = new Alpha05(20);
			
			Alpha05[] alpha= fill(a1,a2); 
			
			alpha[0] =a1;
			System.out.println(alpha[0].val); 
			System.out.println(alpha[1].val); 
		
	}
	
	public static Alpha05[] fill(Alpha05 a1, Alpha05 a2)
	{
		a1.val=15;
		
		Alpha05 fa[] = new Alpha05[] {a2,a1};  // array object created in heap area
		return fa;
	}
}
