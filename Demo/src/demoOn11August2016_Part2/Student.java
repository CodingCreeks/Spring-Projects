package demoOn11August2016_Part2;



public class Student extends Address{
	
	int sno;
	String sname;

	public Student(int sno, String sname, String streetname, String cityname, String statename, String countryname, int zipcode) {
		super(streetname, cityname, statename, countryname, zipcode);
		this.sno = sno;
		this.sname = sname;
		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Student number:" +sno);
		System.out.println("Student name :" +sname);
		super.print();
	}

}
