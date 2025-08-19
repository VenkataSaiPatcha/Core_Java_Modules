package Object_Oriented_Programmings;

interface AlphaBeta
{
	static void m1()
	{
		System.out.println("static method inside an interface");
	}
}
class BetaGamma implements AlphaBeta
{
	
}
public class Java8StaticMethodDemo01 
{
	public static void main(String[] args) 
	{
		AlphaBeta.m1();
	//	BetaGamma.m1();
		
		BetaGamma beta = new BetaGamma();
		//beta.m1();
	}

}
