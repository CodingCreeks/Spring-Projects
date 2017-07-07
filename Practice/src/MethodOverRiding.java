public class MethodOverRiding {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();
	}

}

class Vehicle{
	void run(){
		System.out.println("Vehicle is Running");
	}
}

class Bike extends Vehicle{
	void run(){
		System.out.println("Vehicle is Overriding by Bike");
	}
}