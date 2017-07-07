package demoOn17August2016;

public class staticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA.i=200;
		AA.m1();
	}

}

class AA{
	static int i=100;
	static void m1(){
		i=300;
		System.out.println(i);
	}
}