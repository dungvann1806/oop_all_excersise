package module2bai6;

public class PhongThiNghiem extends PhongHoc{
	private String chuyenNganh;
	private double sucChua;
	private int bonRua;
	
	public PhongThiNghiem() {
		super();
		this.chuyenNganh = "chua co";
		this.sucChua = 0;
		this.bonRua = 0;
	}
	
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			double sucChua, int bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setChuyenNganh(chuyenNganh);
		setSucChua(sucChua);
		setBonRua(bonRua);
	}
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh.equalsIgnoreCase("")?"chua co":chuyenNganh;
	}

	public double getSucChua() {
		return sucChua;
	}

	public void setSucChua(double sucChua) {
		this.sucChua = sucChua<0?0:sucChua;
	}

	public int getBonRua() {
		return bonRua;
	}

	public void setBonRua(int bonRua) {
		this.bonRua = bonRua<0?0:bonRua;
	}

	@Override
	public boolean xetDatChuan() {
		return((getDienTich() / getSoBongDen()) <= 10 && bonRua!=0);
	}
	
	public String toString() {
		return String.format("%-10s%-10s%-10.2f%-10d", super.toString(), chuyenNganh, sucChua, bonRua);
	}
}
