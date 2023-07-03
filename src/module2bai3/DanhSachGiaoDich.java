package module2bai3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachGiaoDich {
  List<GiaoDich> dsGiaoDich;

  public DanhSachGiaoDich() {
    dsGiaoDich = new ArrayList<>();
  }

  public boolean themGiaoDich(GiaoDich giaoDichMoi) {
    if (dsGiaoDich.contains(giaoDichMoi)) return false;
    dsGiaoDich.add(giaoDichMoi);
    return true;
  }

  public boolean xoaDoiTuongTheoMaGiaoDich(String maGiaoDich) {
    return dsGiaoDich.removeIf(x -> x.getMaGiaoDich().equalsIgnoreCase(maGiaoDich));
  }

  public DanhSachGiaoDich sapXepTangDanTheoMaGiaoDich() {
    List<GiaoDich> tempList = new ArrayList<>(dsGiaoDich);

    Collections.sort(tempList, Comparator.comparing(GiaoDich::getMaGiaoDich).reversed());

    DanhSachGiaoDich dsDaSapXep = new DanhSachGiaoDich();
    for (GiaoDich item : tempList) {
      dsDaSapXep.themGiaoDich(item);
    }

    return dsDaSapXep;
  }

  public boolean capNhatGiaGiaoDichTheoMa(String maGiaoDich, double donGia) {
    for (GiaoDich item : dsGiaoDich) {
      if (item.getMaGiaoDich().equalsIgnoreCase(maGiaoDich)) {
        item.setDonGia(donGia);
        return true;
      }
    }
    return false;
  }

  public DanhSachGiaoDich xuatToanBoGiaoDichNgay25Thang12Nam2021() {
    DanhSachGiaoDich dsMoi = new DanhSachGiaoDich();
    for (GiaoDich item : dsGiaoDich) {
      if (item.getNgayGiaoDich().equals(LocalDate.of(2021, 12, 25))) {
        dsMoi.themGiaoDich(item);
      }
    }
    return dsMoi;
  }

  public String toString() {
    String str = "Giao dịch vàng: \n";
    for (GiaoDich item: dsGiaoDich)
      if (item instanceof GiaoDichVang)
        str += (item + "\n");
    str += "Giao dịch đá: \n";
    for (GiaoDich item: dsGiaoDich)
      if (item instanceof GiaoDichDa)
        str += (item + "\n");
    return str;
  }
}
