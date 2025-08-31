package Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDJaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[][][] = new int[3][][]; // 3d jagged array
		arr[0] = new int[2][];
		arr[1] = new int[1][];
		arr[2] = new int[1][];
		
		arr[0][0] = new int[5];
		arr[0][1] = new int[2];
		
		arr[1][0] = new int[3];
		
		arr[2][0] = new int[1];
		
		int len = arr[0][0].length+arr[0][1].length+arr[1][0].length+arr[2][0].length;
		System.out.println("Enter "+len+" elements to store in an array");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k] = sc.nextInt();
				}
				System.out.println();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]);
				}
				System.out.println();
			}
		}
		
		
		
		
	}

}
