package bai7;

public class ToaDo {
	private String ten;
	private float x;
	private float y;

	public String toString() {
		return ten + "(" + x + "," + y + ")";
	}

	public void ToaDo(String ten, float x, float y) {
		this.ten = ten;
		this.x = x;
		this.y = y;
	}

	public void ToaDo() {
		this.ten = "0";
		this.x = 0;
		this.y = 0;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
