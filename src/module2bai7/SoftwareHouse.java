package module2bai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SoftwareHouse {
	private String aName;
	private ArrayList<Employee> ds;

	public SoftwareHouse() {
		this.aName = "chua co";
		ds = new ArrayList<>();
	}

	public SoftwareHouse(String aName) {
		setTheName(aName);
		ds = new ArrayList<>();
	}

	public String getAName() {
		return aName;
	}

	public void setTheName(String aName) {
		this.aName = aName.equalsIgnoreCase("") ? "chua co" : aName;
	}

	public boolean addEmployee(Employee e) {
		return ds.contains(e) ? false : ds.add(e);
	}

	public static String getTitle1() {
		return String.format("%-10s%-10s%-10s%-10s\n", "Ma nv", "Ten nv", "Luong co ban", "Phong ban");
	}

	public static String getTitle2() {
		return String.format("%-10s%-10s%-10s%-10s\n", "Ma nv", "Ten nv", "Luong co ban", "Ngon ngu");
	}

	public String displayAllStaff() {
		String s = "Administrator\n" + getTitle1();
		for (Employee employee : ds) {
			if (employee instanceof Administrator)
				s += employee + "\n";
		}
		s += "Programmer\n" + getTitle2();
		for (Employee employee : ds) {
			if (employee instanceof Programmer&&!(employee instanceof ProjectLeader))//Trường hợp đặt biệt!!!
				s += employee + "\n";
		}
		s += "ProjectLeader\n" + getTitle2();
		for (Employee employee : ds) {
			if (employee instanceof ProjectLeader)
				s += employee + "\n";
		}
		return s;
	}

	public double getMonthlySalaryBill() {
		double sum=0;
		for (Employee employee : ds) {
			sum+=employee.getMonthlySalary();
		}
		return sum;
//		return ds.stream().mapToDouble(Employee -> getMonthlySalaryBill()).sum();
	}

	public SoftwareHouse sortAllStaffByName() {
		SoftwareHouse temp = new SoftwareHouse();
		temp.ds = new ArrayList<Employee>(ds);
		Comparator<Employee> id = Comparator.comparing(Employee::getTheName);
		Collections.sort(temp.ds, id);
		return temp;
	}

	public String displayListProgrammers() {
		String s = "Programmer\n" + getTitle2();
		for (Employee employee : ds) {
			if (employee instanceof Programmer&&!(employee instanceof ProjectLeader))
				s += employee + "\n";
		}
		return s;
	}

	public boolean updateDepartmenForAdmin(int aPayrollNo, String deptNew) {
		for (Employee employee : ds) {
			if (employee instanceof Administrator && employee.getThePayrollNumber() == aPayrollNo) {
				((Administrator) employee).setTheDepartment(deptNew);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteEmployee(int id) {
		return ds.removeIf(Employee->Employee.getThePayrollNumber()==id);
	}

}
