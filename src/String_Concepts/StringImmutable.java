package String_Concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringImmutable 
{
	public static void main(String[] args) 
	{
		//int arr[] = {1,2,3,4,5,6};
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
//		for(int i=0,j=arr.length-1;i<j;i++,j--)
//		{
//			int temp  =arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//		Collections.reverse(list);
//		System.out.println(list);
		
		
		int arr[] = {1,2,3,2,6,1,4,5,6};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ,");
				}
			}
		}
		
	}

}
