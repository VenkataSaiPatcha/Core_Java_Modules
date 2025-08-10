package Object_Oriented_Programmings;

public class StringConstantPool 
{
	public static void main(String[] args) 
	{
		String str = "india";  // stored in scp with a reference of str
		System.out.println(str);
		str=str.toUpperCase();   // then the new literal is stored in scp with the reference of str then the old literal is unchanged still it is there in scp
		System.out.println(str);
		String s1 = "india";  // try to create a new literal in scp memory area inside heap but the same literal is already exist so they not stored, they used already having literal in scp 
		System.out.println(s1);
		
	}

}
