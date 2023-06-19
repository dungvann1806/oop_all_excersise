package module1bai1;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends Chuyenxe {
	private String Noiden;
	private int SoNgay;
	Scanner sc = new Scanner(System.in);
	public ChuyenXeNgoaiThanh(String maCX, String nameCX, String soXe, double doanhThu, Scanner sc, String noiden,
		int soNgay, Scanner sc2) {
		super(maCX, nameCX, soXe, doanhThu,sc);
		Noiden = noiden;
		SoNgay = soNgay;
	}
	public ChuyenXeNgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChuyenXeNgoaiThanh(String maCX, String nameCX, String soXe, double doanhThu, Scanner sc) {
		super(maCX, nameCX, soXe, doanhThu, sc);
		// TODO Auto-generated constructor stub
	}
	public String getNoiden() {
		return Noiden;
	}
	public void setNoiden(String noiden) {
		Noiden = noiden;
	}
	public int getSoNgay() {
		return SoNgay;
	}
	public void setSoNgay(int soNgay) {
		SoNgay = soNgay;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public void Nhap() {
		super.Nhap();
		System.out.println("Noi Den:");
		this.Noiden = sc.nextLine();
		System.out.println("So Ngay:");
		this.SoNgay = sc.nextInt();
		sc.nextLine();
		
	}
	@Override
	public String toString() {
		return "ChuyenXeNgoaiThanh{"+super.toString()+"Noiden=" + Noiden + ", SoNgay=" + SoNgay +"}";
	}
	

}
