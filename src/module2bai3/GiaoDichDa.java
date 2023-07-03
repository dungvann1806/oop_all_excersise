package module2bai3;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GiaoDichDa extends GiaoDich {
  private String loaiDa;
  private int soCarat;

  public GiaoDichDa() {
    super();
    this.loaiDa = "Cẩm thạch";
    this.soCarat = 0;
  }

  public GiaoDichDa(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, String loaiDa, int soCarat) {
    super(maGiaoDich, ngayGiaoDich, donGia);
    setLoaiDa(loaiDa);
    setSoCarat(soCarat);
  }

  public String getLoaiDa() {
    return loaiDa;
  }

  public void setLoaiDa(String loaiDa) {
    this.loaiDa = loaiDa.equalsIgnoreCase("") ? "Cẩm thạch" : loaiDa;
  }

  public int getSoCarat() {
    return soCarat;
  }

  public void setSoCarat(int soCarat) {
    this.soCarat = Math.max(soCarat, 0);
  }

  @Override
  public double tinhThanhTien() {
    if (loaiDa.equalsIgnoreCase("Kim Cương") && soCarat >= 2)
      return (soCarat * super.getDonGia()) * (0.3 * soCarat * super.getDonGia());
    else if (loaiDa.equalsIgnoreCase("Kim Cương") && soCarat < 2)
      return soCarat * super.getDonGia();
    return (soCarat * super.getDonGia()) * (0.1 * soCarat * super.getDonGia());
  }

  @Override
  public String toString() {
    NumberFormat fmt = NumberFormat.getCurrencyInstance(new Locale("vi", "vn"));
    return String.format("%-35s%-15s%-5d%-15s", super.toString(), loaiDa, soCarat, fmt.format(tinhThanhTien()));
  }
}
