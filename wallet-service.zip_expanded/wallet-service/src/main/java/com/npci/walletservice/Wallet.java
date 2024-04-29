
package com.npci.walletservice;

public class Wallet {

	
	private String name;
	private double walletBalance;
	private Account account;
	private double totalAmountToSpend;
	public Wallet(String name, double walletBalance, Account account, double totalAmountToSpend) {
		super();
		this.name = name;
		this.walletBalance = walletBalance;
		this.account = account;
		this.totalAmountToSpend = totalAmountToSpend;
	}
	
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getTotalAmountToSpend() {
		return totalAmountToSpend;
	}
	public void setTotalAmountToSpend(double totalAmountToSpend) {
		this.totalAmountToSpend = totalAmountToSpend;
	}
	
	
}
