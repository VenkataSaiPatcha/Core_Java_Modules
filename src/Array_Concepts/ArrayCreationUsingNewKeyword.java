package Array_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreationUsingNewKeyword 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size=sc.nextInt();
		int arr[] =new int[size];
		
		System.out.println("Enter the"+size+" of elements to store in an array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int a1:arr)
		{
			System.out.println(a1);
		}
		System.out.println(Arrays.toString(arr));
	}

}
