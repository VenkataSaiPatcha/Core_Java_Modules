package Java_Basics_Info;
//WAP in java to pass some value from command line argument based on the following criteria :
//
//If the array length is 0 : It should print length is 0
//If the array length is 1 : It should find the cube of the number
//if the array length is 2 : It should print sum of the number
public class ArrayCalculationsOnLength 
{
	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.err.println("Length is 0");
		}
		else if(args.length==1)
		{
			int num=Integer.parseInt(args[0]);
			System.out.println("Cube os the "+num+" is :"+(num*num*num));
		}
		else if(args.length==2)
		{
			int x=Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("Sum of the"+x+" and "+y+" is :"+(x+y));
		}
	}

}
