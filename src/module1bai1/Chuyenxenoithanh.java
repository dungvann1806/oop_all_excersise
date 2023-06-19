package module1bai1;

import java.util.Scanner;

public class Chuyenxenoithanh extends Chuyenxe {
	private double soKm;
	private String soTuyen;
	Scanner  sc = new Scanner(System.in);
	public Chuyenxenoithanh(String maCX, String nameCX, String soXe, double doanhThu, Scanner sc, double soKm,
			String soTuyen, Scanner sc2) {
		super(maCX, nameCX, soXe, doanhThu, sc);
		this.soKm = soKm;
		this.soTuyen = soTuyen;
	}
	public Chuyenxenoithanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chuyenxenoithanh(String maCX, String nameCX, String soXe, double doanhThu, Scanner sc) {
		super(maCX, nameCX, soXe, doanhThu, sc);
		// TODO Auto-generated constructor stub
	}
	public double getSoKm() {
		return soKm;
	}
	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}
	public String getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhap so Km:");
		this.soKm = sc.nextDouble();
		System.out.println("Nhap So Tuyen:");
		this.soTuyen = sc.nextLine();
		sc.nextLine();
	}
	@Override
	public String toString() {
		return "Chuyenxenoithanh{"+super.toString() +"soKm=" + soKm + ", soTuyen=" + soTuyen + "]";
	}
	
	

}
