package demoOn11August2016_Part2;



public class Address {
	
	String streetname;
	String cityname;
	String statename;
	String countryname;
	int zipcode;

	public Address(String streetname, String cityname, String statename, String countryname, int zipcode) {
		
		this.streetname = streetname;
		this.cityname = cityname;
		this.statename= statename;
		this.countryname = countryname;
		this.zipcode = zipcode;
	}

	public void print() {
		
		System.out.println("Street name:" +streetname);
		System.out.println("City Name:"+cityname);
		System.out.println("statename:" +statename);
		System.out.println("Country Name:"+countryname);
		System.out.println("Post code:"+zipcode);
		
		
	}

}
