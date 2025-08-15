package Array_Concepts;

import java.lang.reflect.Array;
import java.util.Arrays;
// using newInstance() method we create an array
public class NewInstance 
{
	public static void main(String[] args) 
	{
		int arr[]=(int[]) Array.newInstance(int.class,5);  // 1d array
		
		Integer i1[][]=(Integer[][])Array.newInstance(Integer.class, 10,10); // 2d array
		
		Float f[][][][][]=(Float[][][][][])Array.newInstance(Float.class,5,6,7,8,9);  // multi dimensional array
		

	}

}
