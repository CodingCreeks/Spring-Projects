public class MethodOverLoading {
	
	public static void main(String[] args) {
		Addtion obj=new Addtion();
		obj.sum(5,5);
		obj.sum(5,5,5);
	}
	
}

class Addtion{
	void sum(int a, long b){
		System.out.println("Addtion of two numbers is :" +(a+b));
	}
	void sum(int a, long b, long c){
		System.out.println("Addtion of three numbers is :" +(a+b+c));
	}
	
	void sum(long a, long b, long c){
		System.out.println("Addtion of three numbers is :" +(a+b+c));
	}
}