package Array_Concepts;

import java.util.Arrays;

public class MultiDimensionalArray
{
	public static void main(String[] args) 
	{
		int arr[][][]= {{{1,2},{3,4},{5,6}}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
		}
		
		for(int x[][]:arr)
		{
			for(int y[]:x)
			{
				for(int z:y)
				{
					System.out.print(z+" ");
				}
				System.out.println();
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}

}
