package Object_Oriented_Programmings;

public class Student 
{
	String name; //Instance Variable
	 double height;	//Instance Variable
	 int rollNumber;//Instance Variable
	
	//Object behavior
	public void talk()
	{
		System.out.println("Name ::"+name);
		System.out.println("Height::"+height);
		System.out.println("Roll Number ::"+rollNumber);
	}
	//Object behavior
	public void writeExam()
	{
		System.out.println(name+" is writing exam !!");
	}
	public static void main(String[] args) 
	{
		Student student = new Student();
		
		//Initialize the Object Properties using reference variable
		student.name="Venkata Sai";
		student.height=5.9;
		student.rollNumber=111;
		
		//calling the behaviour
		student.talk();
		student.writeExam();
		System.out.println("------------------------");
		
		Student priya = new Student();
		priya.name="Priya";
		priya.height=5.5;
		priya.rollNumber=222;
		
		priya.talk();
		priya.writeExam();
		
	}

}
