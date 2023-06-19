package bai4;

public class ThongTinDangKiXe {
	private String chuXe, loaiXe;
	private int dungTichXL;
	private float giaTriXe;

	public void ThongTinDangKyXe(String chuXe, String loaiXe, int dungTichXL, float giaTriXe) throws Exception {
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		if (dungTichXL >= 0)
			this.dungTichXL = dungTichXL;
		else
			throw new Exception();
		if (giaTriXe >= 0)
			this.giaTriXe = giaTriXe;
		else
			throw new Exception();

	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public void setGiaTriXe(float giaTriXe) throws Exception {
		if (giaTriXe >= 0)
			this.giaTriXe = giaTriXe;
		else
			throw new Exception("Lỗi: Giá trị xe < 0");
	}

	public void setDungTichXL(int dungTichXL) throws Exception {
		if (dungTichXL >= 0)
			this.dungTichXL = dungTichXL;
		else
			throw new Exception();
	}

	public String getChuXe() {
		return chuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public float getGiaTriXe() {
		return giaTriXe;
	}

	public float getDungTichXL() {
		return dungTichXL;
	}

	public float toThuePhaiNop() {
		if (dungTichXL < 100)
			return giaTriXe * 0.01F;
		else if (dungTichXL >= 100 && dungTichXL <= 200)
			return giaTriXe * 0.03F;
		else
			return giaTriXe * 0.05F;
	}

	public String toString() {
		return String.format("%20s %15s %12d %15.2f %15.2f", chuXe, loaiXe, dungTichXL, giaTriXe, toThuePhaiNop());
	}
}
