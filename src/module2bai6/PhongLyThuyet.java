package module2bai6;

public class PhongLyThuyet extends PhongHoc{
	private int mayChieu;
	
	public PhongLyThuyet() {
		super();
		this.mayChieu = 0;
	}
	
	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, int mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setMayChieu(mayChieu);
	}

	public int getMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(int mayChieu) {
		this.mayChieu = mayChieu<0?0:mayChieu;
	}

	@Override
	public boolean xetDatChuan() {
		return((getDienTich()/getSoBongDen())<=10&&mayChieu!=0);
	}
	
	public String toString() {
		return String.format("%-10s%-10d", super.toString(), mayChieu);
	}
	
}
