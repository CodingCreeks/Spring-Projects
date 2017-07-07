package demoOn11August_2016_Part3_Cons;

public class SingleTon {
	public static void main(String [] args){
		
		A.login();
		
	}

}

class A{
	
	private A(){ // Constructor with private
		
		System.out.println("This is SingleTon");
	}
	
	static private A a; // Instance of private class
	
	public static A login(){  // Static method
		if(a==null)
			return a=new A();
		return a;
		
	}	
}