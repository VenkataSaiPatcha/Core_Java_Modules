package Array_Concepts;

import java.util.Arrays;
import java.util.Comparator;

public class ParallelSort01 
{
	public static void main(String[] args) 
	{
//		String [] str = {"Ravi","Ankith","Kiran","Manoj","Sunitha","Amith"};
//		Arrays.parallelSort(str,2,6,Comparator.naturalOrder());
//		System.out.println(Arrays.toString(str));
		
//		double [] d = new double[5];
//		
//		Arrays.setAll(d, (i)-> i*i);
//		System.out.println(Arrays.toString(d));
		
		int arr[] = new int[5];
		Arrays.setAll(arr,(i)->i*i);
		System.out.println(Arrays.toString(arr));
	}

}
