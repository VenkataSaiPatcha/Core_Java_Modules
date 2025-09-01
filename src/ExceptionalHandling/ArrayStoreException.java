package ExceptionalHandling;

import java.util.Arrays;

public class ArrayStoreException {

	public static void main(String[] args) 
	{
		Object obj[] = new String[3];
		obj[0] = "Venkata";
		obj[1] = "Sai";
		obj[2] = 67.90;
		System.out.println(Arrays.toString(obj));
	}

}
