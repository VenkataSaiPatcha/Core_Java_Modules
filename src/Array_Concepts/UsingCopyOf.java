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
		
		String [] arr = {"Patcha","Venkata","Sai"};
		Object []obj = Arrays.copyOf(arr, 5,Object[].class);
		System.out.println(Arrays.toString(obj));
	
	
	}

}
