package Program_Examples;

public class convert_Double_to_String {

	   public static void main(String[] args) {
	        
	       /* Method 1: Using valueOf() method of String class */
	       double dvar1 = 101.11;
	       String str1 = String.valueOf(dvar1);
	       System.out.println("String 1 is: "+str1);
	        
	       /* Method 2: Using toString() method of Double class */
	       double dvar2 = 200.202;
	       String str2 = Double.toString(dvar2);
	       System.out.println("String 2 is: "+str2);
	   }
	}
