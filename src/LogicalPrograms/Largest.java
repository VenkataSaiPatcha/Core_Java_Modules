package LogicalPrograms;

import java.util.Arrays;

public class Largest 
{
	public static void main(String[] args) 
	{
		int arr[] = {80,90,10,20,30,4,6,7,3};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		int max = arr[0];
		for(int n:arr)
		{
			if(n>max)
				max = n;
		}
		System.out.println("largest number in array :"+max);
	}

}
