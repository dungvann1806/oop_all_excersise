package module1bai2;

import java.util.Scanner;

public class Input {
	public static Scanner sc = new Scanner(System.in);
	//tạo ra các hàm để nhập các giá trị danh sach phu hop
	public static int intputInt(String content) {
		int result = 0 ;
		System.out.println(content);
		result = sc.nextInt();
		return result;
	}
	public static float inputFloat(String content) {
		float result = 0;
		System.out.println(content);
		result = sc.nextFloat();
		return result;
	}
	public static  double intputDouble(String content) {
		double result = 0 ;
		System.out.println(content);
		result =  sc.nextDouble();
		return result;
	}
	public static  long intputLong (String content) {
		long result = 0 ;
		System.out.println(content);
		result =  sc.nextLong();
		return result;
	}
	public static  String intpuString (String content) {
		String result = "" ;
		System.out.println(content);
		result =  sc.nextLine();
		result = sc.nextLine();
		return  result;
	}
	public static  String intpuDate () {
		String result = "" ;
		System.out.println("Enter date (dd/MM/yyyy");
		result =  sc.nextLine();
		result = sc.nextLine();
		return  result;
	}	
}
