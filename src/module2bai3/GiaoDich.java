package module2bai3;
import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class GiaoDich {
  private String maGiaoDich;
  private LocalDate ngayGiaoDich;
  private double donGia;

  public abstract double tinhThanhTien();

  public GiaoDich() {
    this.maGiaoDich = "Chưa có";
    this.ngayGiaoDich = LocalDate.now();
    this.donGia = 0;
  }

  public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia) {
    setMaGiaoDich(maGiaoDich);
    setNgayGiaoDich(ngayGiaoDich);
    setDonGia(donGia);
  }

  public String getMaGiaoDich() {
    return maGiaoDich;
  }

  public void setMaGiaoDich(String maGiaoDich) {
    this.maGiaoDich = maGiaoDich.equalsIgnoreCase("") ? "Chưa có" : maGiaoDich;
  }

  public LocalDate getNgayGiaoDich() {
    return ngayGiaoDich;
  }

  public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
    this.ngayGiaoDich = ngayGiaoDich.isBefore(LocalDate.now()) ? ngayGiaoDich : LocalDate.now();
  }

  public double getDonGia() {
    return donGia;
  }

  public void setDonGia(double donGia) {
    this.donGia = donGia >= 0 ? donGia : 0;
  }

  public String toString() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Locale local = new Locale("vi", "vn");
    NumberFormat fmt = NumberFormat.getCurrencyInstance(local);

    return String.format("%-5s%-15s%-15s", maGiaoDich, dtf.format(ngayGiaoDich), fmt.format(donGia));
  }
}
