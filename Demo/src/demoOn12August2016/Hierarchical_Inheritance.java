package demoOn12August2016;

public class Hierarchical_Inheritance {

	public void methodB() {
		System.out.println("method of Class B");
	}

	public static void main(String args[]) {
		B1 obj1 = new B1();
		C1 obj2 = new C1();
		D1 obj3 = new D1();
		obj1.methodA();
		obj2.methodA();
		obj3.methodA();
	}
}

class A1 {
	public void methodA() {
		System.out.println("method of Class A");
	}
}

class B1 extends A1 {
	public void methodB() {
		System.out.println("method of Class B");
	}
}

class C1 extends A1 {
	public void methodC() {
		System.out.println("method of Class C");
	}
}

class D1 extends A1 {
	public void methodD() {
		System.out.println("method of Class D");
	}
}
