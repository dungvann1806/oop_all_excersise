package bai7;

public class HinhTron extends ToaDo {
	private ToaDo tam = new ToaDo(); 
	private double banKinh;

	public void HinhTron(ToaDo tam, double banKinh) {
	this.tam.setTen(tam.getTen());
	this.tam.setX(tam.getX());
	this.tam.setY(tam.getY());
	this.banKinh = banKinh;
}

	public void HinhTron() {
	this.tam.ToaDo();
	this.banKinh = 1;
}

	public ToaDo getTam() {
	return tam;
}

	public void setTam(ToaDo tam) {
	this.tam = tam;
}

	public double getBanKinh() {
	return banKinh;
}

	public void setBanKinh(double banKinh) {
	this.banKinh = banKinh;
}

	public double tinhChuVi() {
	return 2 * Math.PI * banKinh;
}

	public double tinhDienTich() {
	return Math.PI * banKinh * banKinh;
}

	public String toString() {
	return String.format("Diện tích và chu vi hình tròn tâm %s có bán kính %.1fm là %.2f và %.2f",
			tam.toString(), getBanKinh(), tinhDienTich(), tinhChuVi());
	}
}
