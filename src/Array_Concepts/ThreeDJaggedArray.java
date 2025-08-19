package Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDJaggedArray 
{
	public static void main(String[] args) 
	{
		int arr[][][] = new int[3][][]; // 3d jagged array
		arr[0] = new int[3][];
		arr[1] = new int[4][];
		arr[2] = new int[5][];
		
		arr[0][0] = new int[5];
		arr[0][1] = new int[6];
		arr[0][2] = new int[3];
		
		arr[1][0] = new int[2];
		arr[1][1] = new int[3];
		arr[1][2] = new int[5];
		arr[1][3] = new int[4];
		
		arr[2][0] = new int[5];
		arr[2][1] = new int[7];
		arr[2][2] = new int[3];
		arr[2][3] = new int[2];
		arr[2][4] = new int[8];
		
		
		arr[0][0].length+
		
		
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
			System.out.println();
		}
	}

}
