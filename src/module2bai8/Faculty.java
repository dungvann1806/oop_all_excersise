package module2bai8;

public class Faculty extends Person{
	private String facultyID;
	private String office;
	
	public Faculty() {
		super();
		this.facultyID = "chua co";
		this.office = "chua co";
	}
	
	public Faculty(String lastName, String firstName, String facultyID, String office) {
		super(lastName, firstName);
		setFacultyID(facultyID);
		setOffice(office);
	}

	public String getFacultyID() {
		return facultyID;
	}

	public void setFacultyID(String facultyID) {
		this.facultyID = facultyID.equalsIgnoreCase("")?"chua co":facultyID;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office.equalsIgnoreCase("")?"chua co":office;
	}
	
	public String toString() {
		return String.format("%-10s%-10s%-10s", super.toString(), facultyID, office);
	}
	
	
}
