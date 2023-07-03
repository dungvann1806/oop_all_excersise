package module2bai8;

public class Enrolment {
	private String status;
	private String grade;
	private float numGrade;
	private Student student;

	public Enrolment(Student student, String status, String grade, float numGrade) {
		super();
		this.student = student;
		setStatus(status);
		setGrade(grade);
		setNumGrade(numGrade);
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status.equalsIgnoreCase("") ? "chua co" : status;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade.equalsIgnoreCase("") ? "chua co" : grade;
	}

	public float getNumGrade() {
		return numGrade;
	}

	public void setNumGrade(float numGrade) {
		this.numGrade = numGrade < 0 ? 0 : numGrade;
	}

	public String toString() {
		return String.format("%-10s%-10s%-10.2f", status, grade, numGrade);
	}

}
