package module1bai1;

import java.util.Scanner;

public class main {
	public static void main (String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		ListChuyenXe dscx = new ListChuyenXe();
		do {
			System.out.println("1.Them mot chuyen noi thanh:");
			System.out.println("2.Them mot chuyen ngoai thanh:");
			System.out.println("3. Hien thi danh muc chuyen xe:");	
			x = sc.nextInt();
			switch(x){
				case 1:
					dscx.ListCx(1);
				case 2:
					dscx.ListCx(2);
				case 3:
				 	dscx.Xuat();
			}
		} while(x!=0);
		
	}
}