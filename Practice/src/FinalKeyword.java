
public class FinalKeyword {

	public static void main(String[] args) {
		Car obj=new Car();
		System.out.println("Speed Limit is :"+obj.speedLimit);
	}

}

class Car{
	/*final int speedLimit=50;*/ // If you make property to final keyword, you cann't alter the value of the property
	final int speedLimit;
	
	Car(){
		
		speedLimit=200;
	}
}