package module2bai6;

public class Test {
	public static void main(String[] args) {
		DanhSachPhongHoc ds = new DanhSachPhongHoc();
		
		for(int i=1;i<=5;i++) {
			ds.them(new PhongThiNghiem("00"+i, ""+i, i*10, i,""+(char)(i+65),i*50, i));
			ds.them(new PhongLyThuyet("00"+i, ""+i, i*10, i, i));
			ds.them(new PhongMayTinh("00"+i, ""+i, i*10, i, i));
		}
		System.out.println(ds);
		System.out.println("Phong hoc co ma la 001");
		System.out.println(ds.tim("001"));
		System.out.println("Danh sach phong hoc dat chuan");
		System.out.println(ds.getPhongDatChuan());
		System.out.println("Sap xep tang dan theo day nha");
		System.out.println(ds.sapXepTangTheoDayNha());
		System.out.println("Sap xep giam dan theo dien tich");
		System.out.println(ds.sapXepGiamDanDienTich());
		System.out.println("Sap xem tang dan theo so bong den");
		System.out.println(ds.sapXepTangTheoBongDen());
		ds.capNhatMayTinh("001", 1000);
		ds.xoa("002");
		System.out.println("so phong la:");
		System.out.println(ds.demSoPhong());
		System.out.println("Danh sach phong co 60 may");
		System.out.println(ds.layDSPhongCo60May());
		System.out.println("Cap nhat so may 001 la 1000 va so 002");
		System.out.println(ds);
	}
}
