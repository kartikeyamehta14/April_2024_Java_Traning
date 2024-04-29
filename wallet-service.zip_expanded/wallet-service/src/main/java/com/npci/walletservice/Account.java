package com.npci.walletservice;

public class Account {

	
	private long account;
	private double balance;
	private String port;
	public Account(long account, double balance, String port) {
		super();
		this.account = account;
		this.balance = balance;
		this.port = port;
	}
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
	
}
