package Object_Oriented_Programmings;

public class College 
{
	private String collegeName;
	private String collegeLocation;
	public College(String collegeName, String collegeLocation) {
		super();
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeLocation=" + collegeLocation + "]";
	}
	
	

}
