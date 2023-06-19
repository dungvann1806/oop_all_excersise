package bai2;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Attributes atr1 = new Attributes(11111, "Nguyễn Thanh An", 6.5f, 8.5f); 
		Attributes atr2 = new Attributes(22222, "Lê Thị Bông", 7.5f, 8.0f);
		System.out.println(atr1);
		System.out.println(atr2);
		Attributes atr3 = new Attributes();
		System.out.println("Nhap ma so cua sinh vien thu 3");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập họ và tên của sinh viên sv3: "); 
		String name = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sinh viên sv3: "); 
		float pointLT = sc.nextFloat();
		System.out.println("Nhập điểm thực hành của sinh viên sv3: "); 
		float pointTH = sc.nextFloat();
		atr3.setId(id);
		atr3.setName(name);
		atr3.setPointLT(pointLT);
		atr3.setPointTH(pointTH);
		System.out.println(String.format("%-5s %-30s %10s %10s %10s", "masv", "hoten", "diemlt", "diemth", "diemtb"));
		System.out.println(atr1);
		System.out.println(atr2); 
		System.out.println(atr3);
	}

}
