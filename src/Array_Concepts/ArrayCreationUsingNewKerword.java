package Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreationUsingNewKerword 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter the "+size+" elements to store on array");
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) // 1- approach
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("---------------------------");
		for(int ar:arr)
		{
			System.out.println(ar);
		}
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(arr));
		
	}

}
