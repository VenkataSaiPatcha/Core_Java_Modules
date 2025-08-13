package Object_Oriented_Programmings;

//It was possible to write a java program without main method till JDK 1.6V. From JDK 1.7v 
//onwards, at the time of loading the .class file JVM will verify the presence of main method 
//in the .class file. If main method is not available then it will generate a runtime error
//that "main method not found in so so class".

public class MainMethod 
{
	static
	{
		System.out.println("Hello user");
		System.exit(0);
	}
	

}
