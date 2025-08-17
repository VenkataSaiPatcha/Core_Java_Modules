package Object_Oriented_Programmings;

class AAA
{
	final int A=10;
	public void accept()
	{
//		A=10;  Error
		System.out.println("A value is :"+A);
	}
}
public class FinalVariable 
{
	public static void main(String[] args) 
	{
		final AAA a1 = new AAA();
		a1.accept();
		
//		a1 = new AAA(); Error
	}

}
