package bai6;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.35;
	
	Locale local = new Locale("vi", "vn");
	NumberFormat formatter = NumberFormat.getCurrencyInstance(local);

	public void Account() {
		accountNumber = 999999;
		name = "Chưa xác định";
		balance = 50000;
	}

	public void Account(String name, long accountNumber, double balance) {
		Account();
		if (accountNumber > 0)
			this.accountNumber = accountNumber;
		if (!name.trim().equals(""))
			this.name = name;
		if (balance >= 50000)
			this.balance = balance;
	}

	public void Account(String name, long accountNumber) {
		Account();
		if (accountNumber > 0)
			this.accountNumber = accountNumber;
		if (!name.trim().equals(""))
			this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else
			return false;
	}

	public boolean withdraw(double amount, double fee) {
		if (amount > 0 && amount + fee <= balance) {
			balance -= (amount + fee);
			return true;
		}

		else
			return false;
	}

	public String addInterest() {
		balance = balance + balance * RATE;
		String bl = formatter.format(balance);
		return bl;
	}

	public boolean transfer(Account acc2, double amount) {
		if (amount < this.balance) {
			this.balance -= amount;
			acc2.balance += amount;
			return true;
		}

		else
			return false;
	}

	public String toString() {
		String bl = formatter.format(balance);
		return String.format("%5d %15s %10s", accountNumber, name, bl);
	}

}
