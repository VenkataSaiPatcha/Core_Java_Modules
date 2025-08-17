package Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDJaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		int arr[][] = new int[size][];
		System.out.println("Enter the "+arr.length+" values to store in rows");
		for(int i=0;i<arr.length;i++)
		{
			int column=sc.nextInt();
			arr[i] = new int[column];
		}	
			
			int length=arr[0].length+arr[1].length+arr[2].length;
			System.out.println("Enter "+length+" values");
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					arr[i][j] = sc.nextInt();
				}
				System.out.println();
			}
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+" "); // 1 approach
				}
				System.out.println();
			}
			System.out.println("---------------------------");
			for(int x[]:arr)
			{
				for(int y:x)
				{
					System.out.print(y+" ");
				}
				System.out.println();
			}
			System.out.println("---------------------------");
			System.out.print(Arrays.deepToString(arr));
	}

}
