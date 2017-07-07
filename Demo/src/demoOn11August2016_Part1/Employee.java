package demoOn11August2016_Part1;



public class Employee {
	
	int empno;
	String empname;
	Address address;
	
	public Employee(int empno, String empname, String streetname, String cityname, String statename, String countryname, int zipcode) {
		this.empno = empno;
		this.empname = empname;
		address=new Address(streetname, cityname, statename, countryname, zipcode);
	}
	
	public void print(){
		System.out.println("Employee number:" +empno);
		System.out.println("Employee name :" +empname);
		address.print();
	}

}
