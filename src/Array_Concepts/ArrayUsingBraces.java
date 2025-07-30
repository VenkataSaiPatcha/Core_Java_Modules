package Array_Concepts;

import java.util.Arrays;

public class ArrayUsingBraces {

	public static void main(String[] args) 
	{
		int []arr = {1,2,3,4,5,6,7}; //Array using braces
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" "); // 1 - approach
		}
		System.out.println("---------------------------");
		for(int ar:arr)            // 2 - approach
		{
			System.out.println(ar);
		}
		System.out.println("--------------------------");
		System.out.println(Arrays.toString(arr)); // 3 - approach
	}

}
