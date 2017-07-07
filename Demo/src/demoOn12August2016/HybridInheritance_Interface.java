package demoOn12August2016;

public class HybridInheritance_Interface {

	public static void main(String args[]) {
		DD obj1 = new DD();
		obj1.methodA();
		obj1.methodB();
		obj1.methodC();
	}

	interface AA {
		public void methodA();
	}

	interface BB extends AA {
		public void methodB();
	}

	interface CC extends AA {
		public void methodC();
	}

	static class DD implements BB, CC {
		public void methodA() {
			System.out.println("MethodA");
		}

		public void methodB() {
			System.out.println("MethodB");
		}

		public void methodC() {
			System.out.println("MethodC");
		}

	}

}
