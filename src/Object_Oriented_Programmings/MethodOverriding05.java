package Object_Oriented_Programmings;

class RBI
{
	protected String ifscCode = "RBIHYD09675";
	public String loan() {
		return "RBI approved loan";
	}
}
class SBI extends RBI
{
	protected String ifscCode = "SBIAMPT78645"; // variable Hiding
	@Override
	public String loan()
	{
		return "Providing loan with some interest";
	}
}
public class MethodOverriding05 
{
	public static void main(String[] args) 
	{
		RBI r = new SBI();
		System.out.println(r.ifscCode);
		System.out.println(r.ifscCode);
		System.out.println(r.loan());
		
	}

}
