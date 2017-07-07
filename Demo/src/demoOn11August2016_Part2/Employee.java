package demoOn11August2016_Part2;



public class Employee extends Address{
	
	int empno;
	String empname;

	public Employee(int empno, String empname, String streetname, String cityname, String statename, String countryname, int zipcode) {
		super(streetname, cityname, statename, countryname, zipcode);
		this.empno = empno;
		this.empname = empname;
		
	}
	
	public void print(){
		System.out.println("Employee number:" +empno);
		System.out.println("Employee name :" +empname);
		super.print();
	}

}
