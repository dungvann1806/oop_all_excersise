package bai9;

public class main9 {
	public static void main(String[] args) {
	DanhSachCongNhan ds = new DanhSachCongNhan();
	for(int i=0;i<10;i++) {
		ds.themCongNhan(i+1, "Nguyen", "Van Dung", 80*i);
	}
	System.out.println(ds);
	System.out.printf("Số lượng công nhân là %d\n",ds.getSoLuongCongNhan());
	System.out.println("Xóa công nhân thứ 3\n");
	ds.xoaCongNhan(3);
	System.out.printf("Danh sách công nhân làm trên 200 sản phẩm\n%s\n",ds.layDSCongNhan());
	System.out.println("Sắp xếp danh sách công nhân theo sản phẩm giảm dần\n");
	ds.sortDSCN();
	System.out.println(ds);
	}
}
