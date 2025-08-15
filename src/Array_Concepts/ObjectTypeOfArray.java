package Array_Concepts;

import java.util.Arrays;

class Student11
{
	int id;
	String name;
	public Student11(int id, String name) 
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student11 [id=" + id + ", name=" + name + "]";
	}
	
}
public class ObjectTypeOfArray
{
	public static void main(String[] args) 
	{
		Object obj[] = {10,20.0,"Hello",15.0f,'S',new Student11(101, "Sai"),1,2,7,0};
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]+" ");
		}
		System.out.println("------------------");
		for(Object o:obj)
		{
			System.out.println(o);
		}
		System.out.println("------------------");
		System.out.println(Arrays.toString(obj));
		System.out.println("------------------");
		int sum=0;
		for(Object o:obj)
		{
			if(o instanceof Float)
			{
				sum +=(Float)o;
			}
		}
		System.out.println(sum);
	}

}
