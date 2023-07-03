package module2bai8;

public class Student extends Person{
	private String studentID;
	private int yearMatriculated;
	
	public Student() {
		super();
		this.studentID = "chua co";
		this.yearMatriculated = 0;
	}
	
	public Student(String lastName, String firstName, String studentID, int yearMatriculated) {
		super(lastName, firstName);
		setStudentID(studentID);
		setYearMatriculated(yearMatriculated);
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID.equalsIgnoreCase("")?"chua co":studentID;
	}

	public int getYearMatriculated() {
		return yearMatriculated;
	}

	public void setYearMatriculated(int yearMatriculated) {
		this.yearMatriculated = yearMatriculated<0?0:yearMatriculated;
	}
	
	public String toString() {
		return String.format("%-10s%-10s%-10d", super.toString(), studentID, yearMatriculated);
	}
	
	
}
