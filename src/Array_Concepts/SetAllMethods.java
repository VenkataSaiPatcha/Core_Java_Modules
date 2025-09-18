package Array_Concepts;

import java.util.Arrays;

public class SetAllMethods 
{
	public static void main(String[] args) 
	{
		//setAll()
//		String str[] = {"sai","venkat","komali","sridevi"};
//		Arrays.setAll(str,i->String.valueOf(i+2));
//		System.out.println(Arrays.toString(str));
		
		// sort method
		
//		Byte []b = {10,-5,20,3,0,-8};
//		Arrays.sort(b);
//		System.out.println(Arrays.toString(b));
		
//		Byte [] arr = {5,null,-2,9,1};
//		Arrays.sort(arr,(a,b)->
//		{
//			if(a==null) return 1;
//			if(b==null) return -1;
//			return a.compareTo(b);
//		});
//		System.out.println(Arrays.toString(arr));
//		
		byte arr[] = {5,3,1,7,10,0,2};
		Arrays.sort(arr,2,arr.length);  // start= include and end = exclude
		System.out.println(Arrays.toString(arr));
	}

}
