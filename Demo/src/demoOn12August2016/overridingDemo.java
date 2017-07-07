package demoOn12August2016;

public class overridingDemo {
	public static void main(String[] args) {
	}
	
}

class Person {

}

class Employee extends Person {

}

class A {

	Employee print() {
		
		return null;

	}

}

class B extends A {

	// Person print() {  Return type should be base class type cann't be the super class type
	Employee print() {

		return null;
	}
		
	}


