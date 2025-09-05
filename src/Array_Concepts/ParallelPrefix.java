package Array_Concepts;

import java.util.Arrays;

class Iteam
{
	int value;
	public Iteam(int v) 
	{
		this.value=v;
	}
	public String toString()
	{
		return String.valueOf(value);
	}
}
public class ParallelPrefix
{
	public static void main(String[] args) 
	{
//		Iteam i1[] = {new Iteam(1),new Iteam(2), new Iteam(3), new Iteam(4)};
//		Arrays.parallelPrefix(i1, (x,y)->new Iteam(x.value+y.value));
//		System.out.println(Arrays.toString(i1));
		
		Iteam i1[] = {new Iteam(3),new Iteam(4), new Iteam(5), new Iteam(6)};
		Arrays.parallelPrefix(i1,1,4,(x,y)->new Iteam(x.value*y.value));
		System.out.println(Arrays.toString(i1));
	
		
		
	}

}
