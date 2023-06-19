package bai8;

import java.util.Scanner;

public class main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner
		Scanner sc = new Scanner(System.in);
		int temp;
		CDList cdl=new CDList(0);
		do {
			System.out.println("\n\nMENU");
			System.out.println("0. Thoát!");
			System.out.println("1. Nhập vào kích thước mảng");
			System.out.println("2. Thêm 1 CD vào mảng");
			System.out.println("3. Xuất ra toàn bộ danh sách");
			System.out.println("4. Tính số lượng CD có trong mảng");
			System.out.println("5. Xóa CD theo mã");
			System.out.println("6. Tính tổng giá thành của các CD");
			System.out.println("7. Tìm kiếm theo mã CD");
			System.out.println("8. Sắp xếp danh sách giảm dần theo giá thành");
			System.out.println("9. Sắp xếp danh sách tăng dần theo tựa CD");
			System.out.println("Bạn chọn: ");
			temp = sc.nextInt();
			switch (temp) {
			case 1: {
				System.out.println("Nhập vào số phần tử của mảng: ");
				int n = sc.nextInt();
				cdl = new CDList(n);
				break;
			
			}
			case 2: {
				System.out.printf("\nMã CD: ");
				int maCD = sc.nextInt();
				sc.nextLine();
				System.out.println("Tựa CD: ");
				String tuaCD = sc.nextLine();
				System.out.println("Số bài hát: ");
				int soBaiHat = sc.nextInt();
				System.out.println("Giá thành: ");
				double giaThanh = sc.nextDouble();
				try {
					if(cdl.addList(maCD, tuaCD, soBaiHat, giaThanh))
						System.out.println("Thêm thành công!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				
				}break;
			}
			case 3: {
				System.out.println(cdl);
				break;
			}
			case 4: {
				System.out.printf("\nSố lượng CD có trong danh sách là: %d",cdl.demSoCD());
				break;
			}
			case 5: {
				System.out.println("\nMã của CD muốn xóa là: ");
				if(cdl.xoaCD(sc.nextInt()))
					System.out.println("Xóa thành công!");
				else
					System.out.println("Không tồn tại phần tử cần xóa!");
				break;
			}
			case 6: {
				System.out.printf("\nTổng giá thành của các CD là %.2f", cdl.tinhTongGiaThanhCD());
				break;
			}
			case 7: {
				System.out.println("\nMã của CD muốn tìm kiếm là: ");
				if(cdl.searchCD(sc.nextInt()))
					System.out.println("Tìm thấy!");
				else
					System.out.println("Không tìm thấy!");
				break;
			}
			case 8: {
				cdl.sortByPrice();
				break;
			}
			case 9: {
				cdl.sortByName();
				break;
			}
		}
	}while(temp!=0);	
	}
}
