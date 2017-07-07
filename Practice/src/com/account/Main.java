package com.account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount user= new BankAccount();
		user.setCustomerName("John");
		user.setEmail("john@test.com");
		user.setAccountnumber(12345);
		user.setPhonenumber(45345435);
		user.deposit();
		user.withdraw();
		
		user.deposit();
		user.withdraw();
		
		
	}

}
