package module2bai7;
import java.text.NumberFormat;
import java.util.Objects;

public abstract class Employee {
	protected int thePayrollNumber;
	protected String theName;
	protected double theBasicMonthlySalary;

	public Employee() {
		setThePayrollNumber(thePayrollNumber);
		setTheName(theName);
		setTheBasicMonthlySalary(theBasicMonthlySalary);
	}

	public Employee(int thePayrollNumber, String theName, double theBasicMonthlySalary) {
		this.thePayrollNumber = thePayrollNumber;
		this.theName = theName;
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}

	public int getThePayrollNumber() {
		return thePayrollNumber;
	}

	private void setThePayrollNumber(int thePayrollNumber) {
		this.thePayrollNumber = thePayrollNumber < 0 ? 0 : thePayrollNumber;
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName.equalsIgnoreCase("") ? "chua co" : theName;
	}

	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}

	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		this.theBasicMonthlySalary = theBasicMonthlySalary < 0 ? 0 : theBasicMonthlySalary;
	}

	public abstract double getMonthlySalary();


	@Override
	public int hashCode() {
		return Objects.hash(thePayrollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return thePayrollNumber == other.thePayrollNumber;
	}

	public String toString() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return String.format("%-10d%-10s%-10s", thePayrollNumber, theName, formatter.format(theBasicMonthlySalary));
	}
}
