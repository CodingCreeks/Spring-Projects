package com.account;

import javax.swing.JOptionPane;

public class BankAccount {

	private int accountnumber;
	private double balance;
	private String customerName;
	private String email;
	private long phonenumber;
	
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance += balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public double deposit(){
		double deposit=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Amount to Deposit"));
		this.balance +=deposit;
		System.out.println("Your Account Balance is:"+balance);
		return getBalance();
	}
	
	public void withdraw(){
		double withdraw=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Amount to withdraw"));
		if((balance-withdraw)<=0)
			System.out.println("Only " +balance +" Available. Withdrawn not processed....");
		else{
			balance-=withdraw;
			System.out.println("Withdrawal of "+withdraw+" Processed"+" new Balance is "+balance);
		}
		
	}
}
