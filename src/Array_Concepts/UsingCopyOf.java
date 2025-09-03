package Array_Concepts;

import java.util.Arrays;

public class UsingCopyOf
{
	public static void main(String[] args) 
	{
//		byte b[] = {121,122,123,124,125,126,127,-128};
//		byte[]bb=Arrays.copyOf(b, 10);
//		System.out.println(Arrays.toString(bb));
		
//		char ch[] = {'A','B','C','D'};
//		char cc[]=	Arrays.copyOf(ch, 5);
//		System.out.println(Arrays.toString(cc));
		
//		double d[] = {10.1,10.2,10.3,10.4,10.5};
//		double dd[] =Arrays.copyOf(d, 6);
//		System.out.println(Arrays.toString(dd));
//		System.out.println(Arrays.copyOf(d, 6).toString());
		
//		float f[] = {1.0f,1.1f,1.2f,1.3f};
//		float ff[] = Arrays.copyOf(f, 5);
//		System.out.println(Arrays.toString(ff));
		
//		int [] i = {1,2,3,4,5};
//		int []ii=Arrays.copyOf(i, 6);
//		System.out.println(Arrays.toString(ii));
		
//		long [] l = {1l,2l,3l,4l,5l};
//		long []ll = Arrays.copyOf(l, 6);
//		System.out.println(Arrays.toString(ll));
		
//		short [] s = {1,2,3,4,5};
//		short ss[] = Arrays.copyOf(s, 6);
//		System.out.println(Arrays.toString(ss));
		
//		String [] arr = {"Patcha","Venkata","Sai"};
//		Object []obj = Arrays.copyOf(arr, 5,Object[].class);
//		System.out.println(Arrays.toString(obj));
		
//		Integer []i = {10,20,30,40,50};
//		Number[] n= Arrays.copyOf(i, 7,Number[].class);
//		System.out.println(Arrays.toString(n));
		
		//------------------------copyOfRange()----------------
		
//		byte[] b = {121,122,123,124,125,126,127};
//		byte bb[] = Arrays.copyOfRange(b,1,6);
//		System.out.println(Arrays.toString(bb));
		
//		char c[] = {'A','B','C','D','E'};
//		char cc[] = Arrays.copyOfRange(c, 2, 10);
//		System.out.println(Arrays.toString(cc));
		
//		double d[] = {1.0,1.1,1.2,1.3,1.4,1.5};
//		double dd[] = Arrays.copyOfRange(d,3,3);
//		System.out.println(Arrays.toString(dd));
		
//		float f[] = {1.1f,1.2f,1.3f,1.4f};
//		float ff[] = Arrays.copyOfRange(f, 3, 5);
//		System.out.println(Arrays.toString(ff));
		
//		int [] i= {1,2,3,4};
//		int ii[] = Arrays.copyOfRange(i, 0, i.length);
//		System.out.println(Arrays.toString(ii));
		
//		String s[] = {"Patcha","Venkata","sai"};
//		Object obj[] =	Arrays.copyOfRange(s, 0, s.length,Object[].class);
//		System.out.println(Arrays.toString(obj));
		
		//------------------ deepEqual() method------------
//		String s1[] = {"patcha","venkata","sai"};
//		String s2[] = {"patcha","venkata","sai"};
//		System.out.println(Arrays.deepEquals(s1, s2));
//		System.out.println(s1.equals(s2));
//		System.out.println(Arrays.equals(s1, s2));
		
		String s1[][] = {{"patcha","venkata","ram"},{"sai"}};
		String s2[][] = {{"patcha","venkata","ram"},{"sai"}};
		
		System.out.println(Arrays.deepEquals(s1, s2));
		System.out.println(s1.equals(s2));
		System.out.println(Arrays.equals(s1, s2));
	}

}
