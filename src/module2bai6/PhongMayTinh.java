package module2bai6;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;

	public PhongMayTinh() {
		super();
		this.soMayTinh = 0;
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setSoMayTinh(soMayTinh);
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh < 0 ? 0 : soMayTinh;
	}

	@Override
	public boolean xetDatChuan() {
		return((getDienTich() / getSoBongDen()) <= 10 && (getDienTich() / soMayTinh) <= 1.5);
	}

	public String toString() {
		return String.format("%-10s%-10d", super.toString(), soMayTinh);
	}

}
