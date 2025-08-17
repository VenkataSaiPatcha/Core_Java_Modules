package Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;
public class TwoDArrayDemo01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		int arr[][] = new int[size][size];  // 2D Array
		
		System.out.println("Enter the values "+(size*size)+" to store in an 2d array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				int column=sc.nextInt();
				arr[i][j]=column;
			}
			//System.out.println();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");  // first approach
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		for(int []x: arr)
		{
			for(int y:x)
			{
				System.out.print(y+" "); // 2nd approach
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		sc.close();
	}

}
