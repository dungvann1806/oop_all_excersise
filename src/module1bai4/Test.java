package module1bai4;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		double X;
		ListLoDat l=new ListLoDat();
		l.them(new LoDatHinhChuNhat("A1",1000,4,5));
		l.them(new LoDatHinhChuNhat("B1",2000,6,5));
		l.them(new LoDatHinhChuNhat("H1",6000,4,10));
		l.them(new LoDatHinhThang("G2",6000,4,10,8));
		l.them(new LoDatHinhThang("F2",7000,5,10,5));
		System.out.println(l.layTieuDe());
		System.out.println(l.toString());
	/*	System.out.print("Nhập diện tích X:");
		Scanner scr=new Scanner(System.in);
		X=scr.nextDouble();
		System.out.println("Danh sách lô đất có diện tích lớn hơn X:");
		System.out.println(l.layTieuDe());
		System.out.println(l.layDanhSach(X));*/
		l.sapXepTheoDonGia();
		System.out.println("Danh sách lô đất đã sắp xếp theo đơn giá giảm dần:");
		System.out.println(l.layTieuDe());
		System.out.println(l.toString());
		l.sapXepMa();
		System.out.println("Danh sách lô đất đã sắp xếp theo mã tăng dần:");
		System.out.println(l.layTieuDe());
		System.out.println(l.toString());
		System.out.println("Lô đất thành tiền cao nhất:");
		System.out.println(l.timThanhTienCaoNhat());
	}

}
