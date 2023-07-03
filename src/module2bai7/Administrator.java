package module2bai7;

public class Administrator extends Employee {
	private String theDepartment;

	public Administrator() {
		super();
		this.theDepartment = "chua co";
	}

	public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		setTheDepartment(theDepartment);
	}

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment.equalsIgnoreCase("") ? "chua co" : theDepartment;
	}

	@Override
	public double getMonthlySalary() {
		return getTheBasicMonthlySalary()+(getTheBasicMonthlySalary() * 0.4);
	}

	public String toString() {
		return String.format("%-10s%-10s", super.toString(), theDepartment);
	}

}
