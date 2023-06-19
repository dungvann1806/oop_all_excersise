package bai4;

public class main4 {
	public static void main(String[] args) {
		ThongTinDangKiXe xe1 = new ThongTinDangKiXe();
		ThongTinDangKiXe xe2 = new ThongTinDangKiXe();
		ThongTinDangKiXe xe3 = new ThongTinDangKiXe();

		try {
			System.out.println("          Tên chủ xe         Loại xe    Dung tích         Trị giá   Thuế phải nộp");
			System.out.println("================================================================================");
			xe1.ThongTinDangKyXe("Nguyễn Thu Lan", "Future Neo", 100, 35000000);
			xe2.ThongTinDangKyXe("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
			xe3.ThongTinDangKyXe("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);
			System.out.println(xe1.toString());
			System.out.println(xe2.toString());
			System.out.println(xe3.toString());

		} catch (Exception e) {	
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Ket thuc chuong trinh!");
		}
	}

}
