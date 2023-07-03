package module2bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachPhongHoc {
	ArrayList<PhongHoc> ds;

	public DanhSachPhongHoc() {
		ds = new ArrayList<>();
	}

	public boolean them(PhongHoc phongHoc) {
//		if(ds.contains(phongHoc))return false;
		if (ds.indexOf(phongHoc) != -1)
			return false;
		return ds.add(phongHoc);
	}

	public DanhSachPhongHoc tim(String ma) {
		DanhSachPhongHoc temp = new DanhSachPhongHoc();
		for (PhongHoc phongHoc : ds) {
			if(phongHoc.getMaPhong().equalsIgnoreCase(ma))
				temp.them(phongHoc);
		}
		return temp;
	}
	
	public static String getTitle1() {
		return String.format("%-10s%-10s%-10s%-10s%-10s\n", "Ma phong","Day nha","Dien tich","So BDen", "So MChieu");
	}
	public static String getTitle2() {
		return String.format("%-10s%-10s%-10s%-10s%-10s\n", "Ma phong","Day nha","Dien tich","So BDen", "So MTinh");
	}
	public static String getTitle3() {
		return String.format("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Ma phong","Day nha","Dien tich","So BDen", "CNganh","Suc chua","Bon rua");
	}

	public String toString() {
		String s = "Phong ly thuyet:\n"+getTitle1();
		for (PhongHoc phongHoc : ds) {
			if (phongHoc instanceof PhongLyThuyet)
				s += phongHoc + "\n";
		}
		s += "\nPhong May Tinh\n"+getTitle2();
		for (PhongHoc phongHoc : ds) {
			if (phongHoc instanceof PhongMayTinh)
				s += phongHoc + "\n";
		}
		s += "\nPhong Thi Nghiem\n"+getTitle3();
		for (PhongHoc phongHoc : ds) {
			if (phongHoc instanceof PhongThiNghiem)
				s += phongHoc + "\n";
		}

		return s;
	}

	public DanhSachPhongHoc getPhongDatChuan() {
		DanhSachPhongHoc temp = new DanhSachPhongHoc();
		for (PhongHoc phongHoc : ds) {
			if (phongHoc.xetDatChuan())
				temp.them(phongHoc);
		}
		return temp;
	}

	public DanhSachPhongHoc sapXepTangTheoDayNha() {
		DanhSachPhongHoc temp = new DanhSachPhongHoc();
		temp.ds = new ArrayList<PhongHoc>(ds);
		Comparator<PhongHoc> id = Comparator.comparing(PhongHoc::getDayNha);
		Collections.sort(temp.ds, id);
		return temp;
	}

	public DanhSachPhongHoc sapXepGiamDanDienTich() {
		DanhSachPhongHoc temp = new DanhSachPhongHoc();
		temp.ds = new ArrayList<PhongHoc>(ds);
		Comparator<PhongHoc> id = Comparator.comparing(PhongHoc::getDienTich);
		Collections.sort(temp.ds, id.reversed());
		return temp;
	}

	public DanhSachPhongHoc sapXepTangTheoBongDen() {
		DanhSachPhongHoc temp = new DanhSachPhongHoc();
		temp.ds = new ArrayList<PhongHoc>(ds);
		Comparator<PhongHoc> id = Comparator.comparing(PhongHoc::getSoBongDen);
		Collections.sort(temp.ds, id);
		return temp;
	}

	public boolean capNhatMayTinh(String ma, int soMay) {
		for (PhongHoc phongHoc : ds) {
			if (phongHoc instanceof PhongMayTinh && phongHoc.getMaPhong().equalsIgnoreCase(ma)) {
				((PhongMayTinh) phongHoc).setSoMayTinh(soMay);
				return true;
			}
		}
		return false;
	}

	public boolean xoa(String ma) {
		return ds.removeIf(PhongHoc -> PhongHoc.getMaPhong().equalsIgnoreCase(ma));
	}

	public int demSoPhong() {
		return ds.size();
	}

	public DanhSachPhongHoc layDSPhongCo60May() {
		DanhSachPhongHoc temp = new DanhSachPhongHoc();
		for (PhongHoc phongHoc : ds) {
			if (phongHoc instanceof PhongMayTinh && ((PhongMayTinh) phongHoc).getSoMayTinh() == 60)
				temp.them(phongHoc);
		}
		return temp;
	}

}
