package Array_Concepts;

import java.util.Arrays;

public class ArrayClassMethods 
{
	public static void main(String[] args) 
	{
//		int [][] a1 = {{1,2},{3,4}};
//		int [][] a2 = {{1,2},{3,4}};
//		System.out.println(a1.hashCode()+" ---- "+a2.hashCode());
//		System.out.println(Arrays.deepHashCode(a1)+" ---- "+ Arrays.deepHashCode(a2));
//		
//		System.out.println(Arrays.deepToString(a1));
		
	/*	String s1 = "listen";
		String s2 = "silent";
		char []c1 =s1.toCharArray();
		char []c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1, c2));
		boolean b1[]= {true};
		boolean b2 []= {true}; 
		System.out.println(Arrays.equals(b1, b2));
		*/
		
//		boolean b1[] = new boolean[5];
//		System.out.println(Arrays.toString(b1));
//		Arrays.fill(b1, true);
//		System.out.println(Arrays.toString(b1));
//		Arrays.fill(b1,2,5,true);
//		System.out.println(Arrays.toString(b1));
		
//		String str[] = new String[5];
//		System.out.println(Arrays.toString(str));
//		Arrays.fill(str,"sai");
//		System.out.println(Arrays.toString(str));
		
		
//		boolean [] b1 = {true,true,true,false};
//		System.out.println(b1.hashCode());
		
//		String str = null;
//		System.out.println(str.hashCode());
		
		//-- parallelPrefix()--- used to add/product/fraction with dependent on previous elements
		
//		int arr[] = {5,6,7,8,9};
//		Arrays.parallelPrefix(arr, (x,y)->x+y);
//		System.out.println(Arrays.toString(arr));
		
//		double arr[] = {1,2,3,4,5,6};
//		Arrays.parallelPrefix(arr,(x,y)->x*y);
//		System.out.println(Arrays.toString(arr));
//		
//		double arr[] = {1,2,3,4,5};
//		Arrays.parallelPrefix(arr,2,5,(x,y)->x+y);
//		System.out.println(Arrays.toString(arr));
		
		// ---- parallelSetAll() method -- us
		
		int []arr1 = new int[5];
		Arrays.setAll(arr1, i->i*i);
		System.out.println(Arrays.toString(arr1));
		
		int []arr = new int[5];
		Arrays.parallelSetAll(arr, i->i*2);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
