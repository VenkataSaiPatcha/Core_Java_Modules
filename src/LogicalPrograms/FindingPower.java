package LogicalPrograms;

public class FindingPower 
{
	public static void main(String[] args) 
	{
			//System.out.println(Math.pow(2, 5));
			
/*			//swap
			int a=10;
			int b=20;
			System.out.println("a :"+a+", b :"+b);
				a=b;
				b=a;
				System.out.println("a :"+a+", b: "+b);
					
		//swap using third variable
				int x=100;
				int y=200;
				int z=x;
				x=y;
				y=z;
				System.out.println("x :"+x+", y:"+y);
				
				int i=100;
				int j=200;
				i=i+j;//300
				j=i-j;//100
				i=i-j;
				System.out.println("i :"+i+", j :"+j);  */
			
//			int a=10;
//			int b=20;
//			System.out.println(a-(-b));
//			System.out.println(-(-a-b));
//			System.out.println(a- -b);
//			System.out.println(a-(~b)-1);
		
//		int days=40000;
//		int year=days/365;
//		int months=days%365/30;
//		int weeks=days%365%30/7;
//		int day=days%365%30%7;
//		
//		System.out.println(year+" "+months+" "+weeks+" "+day);
		
		m1(1);
	
	}
	
	public static  void m1(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			m1(n+1);  //recursive call
			
		}
	}

}
