package Object_Oriented_Programmings;

public class Student07 
{
	private int studentId;
	private String studentName;
	private College college;  // Has A Relation :Aggregation concept(weak relation)
	
	public Student07(int studentId, String studentName, College college) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.college = college;
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
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student07 [studentId=" + studentId + ", studentName=" + studentName + ", college=" + college + "]";
	} 
	

}
