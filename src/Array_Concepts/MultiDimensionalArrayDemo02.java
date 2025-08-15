package Array_Concepts;

import java.util.Arrays;

public class MultiDimensionalArrayDemo02 
{
public static void main(String[] args) 
{
	int arr[][][][]= {{{{1,2},{3,4},{5,6},{7,8}}}};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			for(int k=0; k<arr[i][j].length;k++)
			{
				for(int l=0;l<arr[i][j][k].length;l++)
				{
					System.out.print(arr[i][j][k][l]+" ");
				}
				System.out.println();
			}
		}
	}
	
	System.out.println("-------------------------------");
	for(int x[][][]:arr)
	{
		for(int y[][]:x)
		{
			for(int z[]:y)
			{
				for(int A:z)
				{
					System.out.print(A+" ");
				}
				System.out.println();
			}
		}
	}
	System.out.println("------------------------");
	System.out.println(Arrays.deepToString(arr));
}
}
