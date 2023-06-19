package bai8;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	public CD() {
		this.maCD = 999999;
		this.tuaCD = "Chua xac dinh";
		this.soBaiHat = 1;
		this.giaThanh = 1;
	}
	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if(maCD>0)
			this.maCD = maCD;
		else 
			this.maCD = 999999;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if(!tuaCD.trim().equals(""))
			this.tuaCD = tuaCD;
		else 
			this.tuaCD = "Chua xac dinh";
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat > 0)
			this.soBaiHat = soBaiHat;
		else this.soBaiHat =1;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		if(giaThanh > 0)
			this.giaThanh = giaThanh;
		else 
			this.giaThanh =1;
	}
	public String toString() {
		return String.format("Mã CD: %d\nTựa CD: %s\nSố bài hát: %d\nGiá thành: %.2f\n", maCD, tuaCD, soBaiHat, giaThanh);
	}
	
}
