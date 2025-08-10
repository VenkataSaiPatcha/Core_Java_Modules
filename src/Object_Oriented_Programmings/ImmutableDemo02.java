package Object_Oriented_Programmings;

public class ImmutableDemo02 
{
	public static void main(String[] args) 
	{
		byte b = 127;
		Byte byt = Byte.valueOf(b);
		System.out.println("Byte object :"+byt);
		
		short s = 3500;
		Short sht = Short.valueOf(s);
		System.out.println("Short Object :"+sht);
		
		int i = 100;
		Integer inte = Integer.valueOf(i);
		System.out.println("Integer object :"+inte);
		
		long l = 1200;
		Long l1 = Long.valueOf(l);
		System.out.println("Long object :"+l1);
		
		float f = 12.1f;
		Float f1 = Float.valueOf(f);
		System.out.println("Float object :"+f1);
		
		double d = 1200.5;
		Double d1 = Double.valueOf(d);
		System.out.println("Double object :"+d1);
		
		char c = 'A';
		Character ch = Character.valueOf(c);
		System.out.println("Character object :"+ch);
		
		boolean bo = true;
		Boolean bool = Boolean.valueOf(bo);
		System.out.println("Boolean Object :"+bool);
		
	}

}
