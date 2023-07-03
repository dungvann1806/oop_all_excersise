package module2bai3;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class GiaoDichVang extends GiaoDich {
  private String loaiVang;
  private int soLuong;
  private String donViTinh;

  public GiaoDichVang() {
    super();
    this.loaiVang = "99";
    this.soLuong = 0;
    this.donViTinh = "Chỉ";
  }

  public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, String loaiVang, int soLuong, String donViTinh) {
    super(maGiaoDich, ngayGiaoDich, donGia);
    setLoaiVang(loaiVang);
    setSoLuong(soLuong);
    setDonViTinh(donViTinh);
  }

  @Override
  public double tinhThanhTien() {
    if (loaiVang.equals("9999"))
      return (soLuong * super.getDonGia()) + (0.1 * (super.getDonGia() * soLuong));
    else if (loaiVang.equals("999"))
      return soLuong * super.getDonGia() + (0.05 * (super.getDonGia() * soLuong));
    else
      return soLuong * super.getDonGia();
  }

  public String getLoaiVang() {
    return loaiVang;
  }

  public void setLoaiVang(String loaiVang) {
    this.loaiVang = loaiVang.equalsIgnoreCase("") ? "99" : loaiVang;
  }

  public int getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(int soLuong) {
    this.soLuong = Math.max(soLuong, 0);
  }

  public String getDonViTinh() {
    return donViTinh;
  }

  public void setDonViTinh(String donViTinh) {
    this.donViTinh = donViTinh.equalsIgnoreCase("") ? "Chỉ" : donViTinh;
  }

  @Override
  public String toString() {
    NumberFormat fmt = NumberFormat.getCurrencyInstance(new Locale("vi", "vn"));
    return String.format("%-35s%-10s%-5d%-10s%-15s", super.toString(), loaiVang, soLuong, donViTinh ,fmt.format(tinhThanhTien()));
  }
}
