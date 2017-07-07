package Program_Examples;

public class convert_String_to_int {
public static void main(String[] args) {
	
	//Method 1: Using Integer.Parse(String s):
	String s1 = "123";
	int num1 = 100;
	int num2 = Integer.parseInt(s1);
	System.out.println(num1+num2);
	
	//Method 1: Using Interger.valueOf(String s):
	String s2 = "-123";
	int num3 = 100;
	int num4 = Integer.valueOf(s2);
	System.out.println(num3+num4);
}

}