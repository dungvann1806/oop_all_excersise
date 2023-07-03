package module2bai3;
import java.time.LocalDate;

public class TestGD {

  public static void main(String[] args) {
    DanhSachGiaoDich  ds = new DanhSachGiaoDich();
    ds.themGiaoDich(new GiaoDichDa("113", LocalDate.of(2021, 12, 25), 1000000, "Kim Cương", 2));
    ds.themGiaoDich(new GiaoDichVang("111", LocalDate.of(2021, 12, 25), 1500000, "9999",2,"Chỉ"));
    ds.themGiaoDich(new GiaoDichVang("111", LocalDate.of(2021, 12, 25), 2000000, "999",1,"Cây"));

    System.out.println("Danh sách giao dịch");
    System.out.println(ds);

    System.out.println("\nDanh sách giao dịch sau khi xóa mã 112");
    ds.xoaDoiTuongTheoMaGiaoDich("112");
    System.out.println(ds);

    System.out.println("\nSắp xếp danh sách giao dịch theo mã tăng dần");
    System.out.println(ds.sapXepTangDanTheoMaGiaoDich());

    System.out.println("\nCập nhật đơn giá của một giao dịch theo mã");
    ds.capNhatGiaGiaoDichTheoMa("111", 2100000);
    System.out.println(ds);

    System.out.println("\nDanh sách giao dịch ngày 25 tháng 12 năm 2021");
    System.out.println(ds.xuatToanBoGiaoDichNgay25Thang12Nam2021());
  }
}
