package Program_Examples;

public class convert_int_to_String {
public static void main(String[] args) {
	
	//Method 1: Using String.valueOf(int i):
	int num1 = 100;
	String s1 = "200";
	String s2 = String.valueOf(num1);
	System.out.println(s1+s2);
	
	//Method 2: Using Integer.toString(int i):
	int num2 = 100;
	String s3 = "123";
	String s4 = Integer.toString(num2);
	System.out.println(s3+s4);
}

}