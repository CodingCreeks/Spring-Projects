package demoOn11August2016_Part1;



public class Address {
	
	String streetname;
	String cityname;
	String statename;
	String countryname;
	int zipcode;

	public Address(String streetname, String cityname, String statename, String countryname, int zipcode) {
		super();
		this.streetname = streetname;
		this.cityname = cityname;
		this.statename= statename;
		this.countryname = countryname;
		this.zipcode = zipcode;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Street name:" +streetname);
		System.out.println("City Name:"+cityname);
		System.out.println("statename:" +statename);
		System.out.println("Country Name:"+countryname);
		System.out.println("Post code:"+zipcode);
		
		
	}

}
