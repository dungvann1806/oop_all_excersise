package module1bai1;

public class ListChuyenXe {
	private Chuyenxe[] CX = new Chuyenxe[2];
	private  int countCX=0;
	private double sum1=0 , sum2=0;
	public void ListCx(int temp) {
		if(countCX >2)
			System.out.println("Khong The Them Du Lieu!!!");
		else {
				if(temp == 1) {
					CX[countCX]= new Chuyenxenoithanh();
					Chuyenxenoithanh  n = new Chuyenxenoithanh();
					n.Nhap();
					CX[countCX]=n;
					sum1 += n.getDoanhThu();
				}
				else {
					CX[countCX]= new ChuyenXeNgoaiThanh();
					ChuyenXeNgoaiThanh  n = new ChuyenXeNgoaiThanh();
					n.Nhap();
					CX[countCX]=n;
					sum1 += n.getDoanhThu();
				}
			}
	}
	public void Xuat() {
		for(int i = 0 ; i < countCX ; i++) {
			System.out.println(CX[i].toString());	
		}
		System.out.println("---------Doanh Thu--------");
		System.out.println("Chuyen xe noi Thanh"+sum1);
		System.out.println("Chuyen xe ngoai thanh"+sum2);
		
	}
}
