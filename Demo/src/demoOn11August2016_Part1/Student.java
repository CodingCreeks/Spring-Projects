package demoOn11August2016_Part1;



public class Student{
	
	int sno;
	String sname;
	Address address;

	public Student(int sno, String sname, String streetname, String cityname, String statename, String countryname, int zipcode) {
		
		this.sno = sno;
		this.sname = sname;
		address=new Address(streetname, cityname, statename, countryname, zipcode);
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Student number:" +sno);
		System.out.println("Student name :" +sname);
		address.print();
	}

}
