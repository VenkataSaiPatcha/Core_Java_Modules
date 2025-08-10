package Object_Oriented_Programmings;

public class Aggregation
{
	public static void main(String[] args) 
	{
		College c1 = new College("MBU", "Tirupati");
		Student07 s1 = new Student07(101, "sai", c1);
		Student07 s2 = new Student07(102, "venky", c1);
		Student07 s3 = new Student07(103, "Ravi", c1);
		Student07 s4 = new Student07(104, "Raju", c1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
//		
//		Student07 s5 = new Student07(101, "sai", new College("MBU","Tirupati"));
//		System.out.println(s5);
		
	}

}
