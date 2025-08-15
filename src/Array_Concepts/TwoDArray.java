package Array_Concepts;

import java.util.Arrays;

public class TwoDArray 
{
	public static void main(String[] args) 
	{
		int arr[][]= {{1,2},{3,4}};
		
		for(int i=0;i<arr.length;i++)   // approach -1
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int[] ar:arr)
		{
			for(int x: ar)
			{
				System.out.print(x+" ");  // 2 approach
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println(Arrays.deepToString(arr));
	}

}
