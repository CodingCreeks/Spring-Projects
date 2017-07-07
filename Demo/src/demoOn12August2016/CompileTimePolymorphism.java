package demoOn12August2016;

class CompileTimePolymorphism {
	public static void main(String args[]) {
		compile Obj = new compile();

		double result;

		Obj.methodA(20);
		Obj.methodA(20, 30);
		result = Obj.methodA(5.5);
		System.out.println("Answer is:" + result);
	}
}

class compile {
	void methodA(int num) {
		System.out.println("methodA:" + num);
	}

	void methodA(int num1, int num2) {
		System.out.println("methodA:" + num1 + "," + num2);
	}

	double methodA(double num) {
		System.out.println("methodA:" + num);
		return num;
	}
}