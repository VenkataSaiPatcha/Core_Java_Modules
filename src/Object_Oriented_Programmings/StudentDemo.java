package Object_Oriented_Programmings;

public class StudentDemo 
{
	private int studentId;  
	private String studentName; 
	private int studentMarks;
	private String studentAddress;
	
	
	public StudentDemo(int studentId, String studentName, int studentMarks, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.studentAddress = studentAddress;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getStudentMarks() {
		return studentMarks;
	}


	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "StudentDemo [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", studentAddress=" + studentAddress + "]";
	}

	public static void main(String[] args) 
	{
		StudentDemo sd = new StudentDemo(101, "sai", 78, "kondapur");
		System.out.println(sd);
		//Address updated
		sd.setStudentAddress("Hitec_City");
		System.out.println(sd);
		
		int marks=sd.getStudentMarks();
		if(marks>=90)
		{
			System.out.println(sd.getStudentName()+" is Excellent in Subject");
		}
		else if (marks>=75)
		{
			System.out.println(sd.getStudentName()+" is Very good in Subject");
		}
		else
		{
			System.out.println(sd.getStudentName()+" is good in Subject");
		}
	}

}
