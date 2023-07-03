package module2bai6;

import java.util.Objects;

public abstract class PhongHoc {
	private String maPhong;
	private String dayNha;
	private double dienTich;
	private int soBongDen;
	
	public PhongHoc() {
		maPhong = "chua co";
		dayNha = "chua co";
		dienTich = 0;
		soBongDen = 0;
	}

	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong.equalsIgnoreCase("")?"chua co":maPhong;
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha.equalsIgnoreCase("")?"chua co":dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich < 0?0:dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen<0?0:soBongDen;
	}
	
	public abstract boolean xetDatChuan();
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}

	public String toString() {
		return String.format("%-10s%-10s%-10.2f%-10d", maPhong, dayNha, dienTich, soBongDen);
	}
}
