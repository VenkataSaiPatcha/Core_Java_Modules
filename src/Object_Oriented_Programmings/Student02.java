package Object_Oriented_Programmings;

public class Student02 
{
	int rollNumber;
	String studentName;
	String studentAddress;
	static String collegeName = "JNTU";
	static String courseName = "B.Tech";

	public void setStudentData(int rollNumber, String studentName, String studentAddress) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	@Override
	public String toString() {
		return "Student02 [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress +", College Name "+Student02.collegeName+", Course Name "+Student02.courseName +"]";
	}



	public static void main(String[] args) 
	{
		Student02 raj = new Student02();
		raj.setStudentData(101, "Raj", "Ameerpet");
		
		Student02 priya = new Student02();
		priya.setStudentData(102, "Priya", "S R Nagar");
		
		Student02 scott = new Student02();
		scott.setStudentData(103, "Scott", "Koti");
		
		
		System.out.println(raj);
		System.out.println(priya);
		System.out.println(scott);
		
	}

}
