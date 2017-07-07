package Program_Examples;

public class demoStatic {

	public static void main(String[] args) {
	abc a=new abc();
	a.a=5;
	a.c='c';
	a.s="abc";
	
	}
}

final class abc{
	int a;
	char c;
	String s;
	abc(){
		a++;
		System.out.println(a);
		System.out.println(c);
		System.out.println(s);
	}
}