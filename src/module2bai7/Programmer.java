package module2bai7;

public class Programmer extends Employee {
	protected String theLanguage;

	public Programmer() {
		super();
		this.theLanguage = "chua co";
	}

	public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		setTheLanguage(theLanguage);
	}

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage.equalsIgnoreCase("") ? "chua co" : theLanguage;
	}

	@Override
	public double getMonthlySalary() {
		return theLanguage.equalsIgnoreCase("Java") ? (getTheBasicMonthlySalary()+getTheBasicMonthlySalary() * 0.2) : getTheBasicMonthlySalary();
	}
	
	public String toString() {
		return String.format("%-10s%-10s", super.toString(), theLanguage);
	}
}
