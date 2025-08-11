package LogicalPrograms;

public class CurrencyDenomination 
{
	public static void main(String[] args) 
	{
		int currency=188;
		int fiveHundreds=188/500;
		int twoHundreds = 188%500/200;
		int hundreds=188%500%200/100;
		int fiftys = 188%500%200%100/50;
		int tens=188%500%200%100%50/10;
		
		System.out.println("500 :"+fiveHundreds);
		System.out.println("200 :"+twoHundreds);
		System.out.println("100 :"+hundreds);
		System.out.println("50 :"+fiftys);
		System.out.println("10 :"+tens);
	
	}
	

}
