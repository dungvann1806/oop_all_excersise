package bai1;

public class toaDo {
	private double x;
	private double y;
	private String ten;
	public toaDo() {
		ten="0";
		
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public toaDo(double x, double y, String ten) {
		super();
		this.x = x;
		this.y = y;
		this.ten = ten;
	}
	@Override
	public String toString() {
		return String.format("%s(%.2f,%.2f)", ten,x,y);
	}
	
	
	
}
