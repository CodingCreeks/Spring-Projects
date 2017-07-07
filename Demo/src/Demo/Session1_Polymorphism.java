package Demo;

public class Session1_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.m1();

	}

}

class A{
	void m1(){
		System.out.println("In A-M1");
	}
}

class B extends A{
	void m1(){
		System.out.println("In B-M1");
	}
}

class C extends A{
	void m1(){
		System.out.println("In C-M1");
	}
}