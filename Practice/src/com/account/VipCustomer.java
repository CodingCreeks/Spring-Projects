package com.account;

public class VipCustomer {
	
	private String name;
	private double creditlimit;
	private String emailaddress;

	public static void main(String[] args) {
		
		VipCustomer vc1=new VipCustomer();
		System.out.println("\nAcccount Details:");
		System.out.println("Name :" +vc1.getName()+"\nCredit Limit :"+vc1.getCreditlimit()+"\nEmail Address :"+vc1.getEmailaddress());
				
		VipCustomer vc2=new VipCustomer("Mark", 15000);
		System.out.println("\nAcccount Details:");
		System.out.println("Name :" +vc2.getName()+"\nCredit Limit :"+vc2.getCreditlimit()+"\nEmail Address :"+vc2.getEmailaddress());
		
		VipCustomer vc3=new VipCustomer("John", 50000, "john@test.com");
		System.out.println("\nAcccount Details:");
		System.out.println("Name :" +vc3.getName()+"\nCredit Limit :"+vc3.getCreditlimit()+"\nEmail Address :"+vc3.getEmailaddress());

	}

	
	public VipCustomer() {
		this("Default Name", 0, "default@default.com");
		System.out.println("Default Constructor calling..........");
	}

	public VipCustomer(String name, double creditlimit) {
		
		this(name, creditlimit, "default@default.com");
		System.out.println("Two parameters Constructor calling..........");
	}


	public VipCustomer(String name, double creditlimit, String emailaddress) {
		
		this.name = name;
		this.creditlimit = creditlimit;
		this.emailaddress = emailaddress;
		System.out.println("Three parameters Constructor calling..........");
	}


	public String getName() {
		return name;
	}


	public double getCreditlimit() {
		return creditlimit;
	}


	public String getEmailaddress() {
		return emailaddress;
	}
}

