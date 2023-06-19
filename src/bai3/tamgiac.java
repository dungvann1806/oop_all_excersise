package bai3;
import java.lang.Math;

public class tamgiac {
	private float ma, mb, mc;

	public void tgMD() {
		ma = mb = mc = 1;
	}

	public void setTG(float ma, float mb, float mc) {
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
		if (ma < 0 || mb < 0 || mc < 0 || (ma + mb) <= mc || (ma + mc) <= mb || (mc + mb) <= ma)
			ma = mb = mc = 0;
	}

	public void setMa(float ma) {
		if (ma < 0 || (ma + mb) <= mc || (ma + mc) <= mb || (mc + mb) <= ma)
			;
		else
			this.ma = ma;
	}

	public void setMb(float mb) {
		if (mb < 0 || (ma + mb) <= mc || (ma + mc) <= mb || (mc + mb) <= ma)
			;
		else
			this.mb = mb;
	}

	public void setMc(float mc) {
		if (mc < 0 || (ma + mb) <= mc || (ma + mc) <= mb || (mc + mb) <= ma)
			;
		else
			this.mc = mc;
	}

	public float getMa() {
		return ma;
	}

	public float getMb() {
		return mb;
	}

	public float getMc() {
		return mc;
	}

	private float cv, dt;

	public float tinhCV() {
		cv = (ma + mb + mc) / 2;
		return cv;
	}

	public float tinhDT() {
		dt = (float) Math.sqrt(cv * (cv - ma) * (cv - mb) * (cv - mc));
		return dt;
	}

	private String kieuTG;

	public String traveKTG() {
		if (ma < 0 || mb < 0 || mc < 0 || ma + mb <= mc || mb + mc <= ma || ma + mc <= mb)
			kieuTG = "Khong phai tam giac";
		else if (ma == mb && mb == mc)
			kieuTG = "Tam giac deu";
		else if (ma == mb || mb == mc || ma == mc)
			kieuTG = "Tam giac can";
		else
			kieuTG = "Tam giac thuong";
		return kieuTG;
	}

	public String toString() {
		return String.format("%.2f %.2f %.2f %s %.2f %.2f", ma, mb, mc, kieuTG, cv, dt);
	}
	
	

}
