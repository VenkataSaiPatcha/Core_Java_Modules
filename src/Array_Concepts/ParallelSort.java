package Array_Concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ParallelSort 
{
	public static void main(String[] args) 
	{
//		Integer [] arr = {43,23,1,5,6,90};
//		Arrays.parallelSort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		String [] str = {"sai","kiran","ramesh","vishnu","mahesh"};
//		String [] str1 = {"raju","ramesh","hari","akash","amit"};
//		Arrays.parallelSort(str,Comparator.naturalOrder());
//		Arrays.parallelSort(str, Comparator.reverseOrder());
//		System.out.println(Arrays.toString(str));
		
//		int arr[] = {1,2,3,4,5,6,7};
//		System.out.println("Arrays size is :"+arr.length);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size");
//		int size = sc.nextInt();
//		int arr1[] = new int[size];
//		System.out.println(arr1.length);
//		System.out.println(Arrays.toString(arr1));
		
//		Integer [] arr = {5,10,1,6,2,115,56};
//		Arrays.parallelSort(arr,2,arr.length-1);
//		System.out.println(Arrays.toString(arr));
		
		String str[] = {"sai","ashok","amith","venky","rajesh"};
		Arrays.parallelSort(str,2,str.length-1,Comparator.naturalOrder());
		System.out.println(Arrays.toString(str));
	}

}
