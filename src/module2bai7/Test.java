package module2bai7;

public class Test {
	public static void main(String[] args) {
		SoftwareHouse ds = new SoftwareHouse();
		for(int i=0;i<5;i++) {
			if(ds.addEmployee(new Administrator(i, ""+(char)(i+65), i, ""+(char)(i+65))))
				System.out.println("Them thanh cong!!!");
			else System.out.println("Trung ma!!!");
			
			if(ds.addEmployee(new Programmer(i, ""+(char)(i+65), i, ""+(char)(i+65))))
				System.out.println("Them thanh cong!!!");
			else System.out.println("Trung ma!!!");
			
			if(ds.addEmployee(new ProjectLeader(i, ""+(char)(i+65), i, ""+(char)(i+65))))
				System.out.println("Them thanh cong!!!");
			else System.out.println("Trung ma!!!");
		}
		System.out.println(ds.displayAllStaff());
		System.out.println("Tong tien phai tra cho nhan vien la: ");
		System.out.println(ds.getMonthlySalaryBill());
		System.out.println("Sap xep theo ten");
		System.out.println(ds.sortAllStaffByName().displayAllStaff());
		System.out.println("Danh sach lap trinh vien");
		System.out.println(ds.displayListProgrammers());
		ds.updateDepartmenForAdmin(3, "Hello");
		ds.deleteEmployee(4);
		System.out.println(ds.displayAllStaff());
	}
}
