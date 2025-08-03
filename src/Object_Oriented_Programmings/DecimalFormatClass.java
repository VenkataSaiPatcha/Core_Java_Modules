package Object_Oriented_Programmings;

import java.text.DecimalFormat;

public class DecimalFormatClass 
{
	public static void main(String[] args) 
	{
		DecimalFormat df1 = new DecimalFormat("0.0");
		System.out.println(df1.format(3.5));
		
		DecimalFormat df2 = new DecimalFormat("#,##.00");
		System.out.println(df2.format(123.5));
		
		DecimalFormat df3 = new DecimalFormat("#.##");
		System.out.println(df3.format(5.289));
	}

}
