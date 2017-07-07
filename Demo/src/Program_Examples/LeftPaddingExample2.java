package Program_Examples;
class LeftPaddingExample2 {
	  public static void main(String[] args) {
	    System.out.println("#" + padLeftZeros("mystring", 10) + "@");
	    System.out.println("#" + padLeftZeros("mystring", 15) + "@");
	    System.out.println("#" + padLeftZeros("mystring", 20) + "@");
	 }

	  public static String padLeftZeros(String str, int n) {
	    return String.format("%1$" + n + "s", str).replace(' ', '0');
	  }
	}