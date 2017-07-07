
public class calFeetAndInchesToCentimeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calFeetAndInchesToCentimeter(6,12);
		System.out.println("--------------------");
		calFeetAndInchesToCentimeter(-2);
	}
	
	public static double calFeetAndInchesToCentimeter(double feet, double inches){
		if(feet>=0 && (inches>=0 && inches<=12)){
			System.out.println(feet +" Feet = " + (feet* 12* 2.54)+" cm" +"\n" + inches +" Inches = "+convertinches(inches)+" cm");
		}
		
		if(feet<0 || (inches<0 || inches>12)){
			System.out.println("Invalid values");
			return -1;
		}
		return 0;
	}
	
	public static double calFeetAndInchesToCentimeter(double inches){
		if(inches>=0){
			System.out.println(inches +" Inches = "+convertinches(inches)+" cm");
		}
		else
			System.out.println("Invalid Inches values");
		return -1;	
	}


	private static double convertinches(double inches) {
		// TODO Auto-generated method stub
		
		return inches*2.54;
	}
}
