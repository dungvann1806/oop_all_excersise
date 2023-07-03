package module2bai7;

public class ProjectLeader extends Programmer{
	
	public ProjectLeader() {
		super();
	}
	
	public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
	}
	@Override
	public double getMonthlySalary() {
		return super.getMonthlySalary()+getTheBasicMonthlySalary()*0.2;
	}
}
