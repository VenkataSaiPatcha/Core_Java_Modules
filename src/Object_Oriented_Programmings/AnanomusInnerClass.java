package Object_Oriented_Programmings;

class MobileClass
{
	public void ringing()
	{
		System.out.println("Super class Mobile is ringing");
	}
}
public class AnanomusInnerClass 
{
	public static void main(String[] args) 
	{
		MobileClass mb = new MobileClass()
				{
			@Override
				public void ringing()
				{
					System.out.println("sub class mobile is ringing");
				}
				};
				mb.ringing();
	}

}
