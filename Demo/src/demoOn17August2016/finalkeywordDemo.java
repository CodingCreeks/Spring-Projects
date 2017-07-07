package demoOn17August2016;

public class finalkeywordDemo {

	public static void main(String[] args) {
		A obj=new A();
		//obj.J=200; // The final field A.J cannot be assigned
		
		obj.m1();
		obj.m2();
		obj.m3();

	}

}


class A{
	int i;
	//final int J;  // final variable should be initialize and 
					// final variable must be in CAPITAL LETTERS for easy to differentiate from the normal variables
	final int J=140;
	
	void m1(){System.out.println("In class 'A' method m1");	}
	void m2(){System.out.println("In class 'A' method m2");	}
	final void m3(){System.out.println("In class 'A' method m3");	}
}

final class B extends A{
	void m1(){System.out.println("In class 'B' method m1");	}
	void m2(){System.out.println("In class 'B' method m2");	}
	//void m3(){System.out.println("In class 'B' method m3");	} // Cannot override the final method
}

//class C extends B{ // The type C cannot subclass the final class B because class 'B' is final cann't inherit
final class C {
	void m1(){System.out.println("In class 'A' method m1");	}
	void m2(){System.out.println("In class 'A' method m2");	}
	final void m3(){System.out.println("In class 'A' method m3");	}
}