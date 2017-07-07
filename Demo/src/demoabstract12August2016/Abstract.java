package demoabstract12August2016;

public class Abstract {

	public static void main(String[] args) {
		
		//A obj = new C();
		C obj = new C();
		
		obj.method1();
		obj.method2();
		obj.method3();
	}
}

abstract class A {  
	void method1() {System.out.println("I am in method-1");	}
	abstract void method2();
}

abstract class B extends A {
	void method2() {System.out.println("I am in method-2");	}
	abstract void method3();
}

class C extends B {
	void method3() { System.out.println("I am in method-3"); }
}