package Array_Concepts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClassConcept 
{
	public static void main(String[] args) 
	{
//		Object obj[]= {10,20.0,"sai",new Object().toString(),'A',120L};
//			System.out.println(Array.get(obj, 3));
		
//		boolean arr[] = {true,false,true,true,false};
//		System.out.println(Array.getBoolean(arr, 0));
		
//		byte b[] = {123,124,125,126,127,-128};
//		System.out.println(Array.getByte(b, 5));
		
//		char ch[]= {'A','B','C','D'};
//		System.out.println(Array.getChar(ch, 3));
		
//		double d[]= {11.1,11.2,11.3,11.4,11.5,11.6,11.7};
//		System.out.println(Array.getDouble(d, 0));
		
//		float f[]  = {12.0f,12.1f,12.2f,12.3f};
//		System.out.println(Array.getFloat(f, 0));
		
//		int arr[] = {12,13,14,15,16,17,18,19};
//		System.out.println(Array.getInt(arr,5));
		
//		int len[]= {10,20,30,40,50};
//		System.out.println(Array.getLength(len));
		
//		long l[]= {12L,13L,14L,15L,16L};
//		System.out.println(Array.getLong(l, 0));
		
//		short s[]= {12,13,14,15,16,17,18};
//		System.out.println(Array.getShort(s, 0));
	
//		Object arr = java.lang.reflect.Array.newInstance(String.class, 3);
//		String[] strArr = (String[]) arr;
//		System.out.println(strArr.length);
		
//		Object arr = java.lang.reflect.Array.newInstance(int.class, 2,2);
//		 int var[][]= (int[][])arr;
//		System.out.print	(Arrays.deepToString(var));
		
//		int[] arr = {10,20,30,40,50,60};
//		System.out.println(Arrays.toString(arr));
//		Array.setInt(arr, 0, 100);
//		System.out.println(Arrays.toString(arr));
		
//		Object arr[] = {"Hello",12,34.5,7.0,'A',new Object(),"Sai"};
//		System.out.println(Arrays.toString(arr));
//		Array.set(arr, 0, "James Goslee");
//		System.out.println(Arrays.toString(arr));
		
		int []arr = (int[]) Array.newInstance(int.class, 10);   // 1D
		System.out.println(Arrays.toString(arr));
		
		Integer arr1[][] = (Integer[][]) Array.newInstance(Integer.class, 5,5); // 2D
		System.out.println(Arrays.deepToString(arr1));
		
		Integer arr2[][][][] = (Integer[][][][]) Array.newInstance(Integer.class, 4,3,2,1);
		System.out.println(Arrays.deepToString(arr2));
	}

}
