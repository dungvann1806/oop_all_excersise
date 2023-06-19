package bai6;

import java.util.Scanner;

public class main6 {
	public static  void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	Account acc1 = new Account();
	Account acc2 = new Account();
	Account acc3 = new Account();
	acc1.Account("Ted Murphy", 72354, 100000);
	acc2.Account("Jane Smith", 69713, 40000);
	acc3.Account("Edward Demsey", 93757, 700000);
	
	System.out.println(acc1.toString());
	System.out.println(acc2.toString());
	System.out.println(acc3.toString());
	
	System.out.println("Nhập số tiền cần gửi cho Account1: ");
	if(acc1.deposit(sc.nextDouble()))System.out.println("Gửi tiền thành công!");
	else System.out.println("Gửi tiền thất bại!");
	System.out.println("Nhập số tiền cần gửi cho Account2: ");
	if(acc2.deposit(sc.nextDouble()))System.out.println("Gửi tiền thành công!");
	else System.out.println("Gửi tiền thất bại!");
	
	System.out.println("Nhập số tiền cần rút cho Account2: ");
	if(acc2.withdraw(sc.nextDouble(), 2000))System.out.println("Rút tiền thành công!");
	else System.out.println("Rút tiền thất bại!");
	
	
	System.out.println("Tiền lãi của Account3 là "+acc3.addInterest());

	System.out.println(acc1.toString());
	System.out.println(acc2.toString());
	System.out.println(acc3.toString());
	
	System.out.println("Nhập số tiền cần chuyển từ Account 2 cho Account1: ");
	if(acc2.transfer(acc1, sc.nextDouble()))System.out.println("Chuyển tiền thành công!");
	else System.out.println("Chuyển tiền thất bại!");
	
	System.out.println(acc1.toString());
	System.out.println(acc2.toString());

}
}