package module1bai1;

import java.util.Scanner;

public class Chuyenxe {
	private String MaCX;
	private String NameCX;
	private String SoXe;
	private double doanhThu;
	Scanner sc = new Scanner(System.in);
	//
	//
	//
	public Chuyenxe(String maCX, String nameCX, String soXe, double doanhThu, Scanner sc) {
		super();
		MaCX = maCX;
		NameCX = nameCX;
		SoXe = soXe;
		this.doanhThu = doanhThu;
		this.sc = sc;
	}
	//
	public Chuyenxe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaCX() {
		return MaCX;
	}
	public void setMaCX(String maCX) {
		MaCX = maCX;
	}
	public String getNameCX() {
		return NameCX;
	}
	public void setNameCX(String nameCX) {
		NameCX = nameCX;
	}
	public String getSoXe() {
		return SoXe;
	}
	public void setSoXe(String soXe) {
		SoXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public void Nhap() {
		System.out.println("Nhap ma so chuyen:");
		this.MaCX = sc.nextLine();
		System.out.println("Nhap Ho ten Tai xe");
		this.NameCX = sc.nextLine();
		System.out.println("Nhap ma so xe:");
		this.SoXe = sc.nextLine();
		System.out.println("Nhap doanh thu");
		this.doanhThu = sc.nextDouble();
		sc.nextLine();
	}
	//
	//
	@Override
	public String toString() {
		return "Chuyenxe [MaCX=" + MaCX + ", NameCX=" + NameCX + ", SoXe=" + SoXe + ", doanhThu=" + doanhThu +"]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
