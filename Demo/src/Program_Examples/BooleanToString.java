package Program_Examples;

public class BooleanToString {
    public static void main(String[] args) {
        
        /* Method 1: using valueOf() method of String class */
        boolean boovar1 = true;
        String str = String.valueOf(boovar1);
        System.out.println("String is: "+str);
        
        /* Method 2: using toString() method of Boolean class */
        boolean boovar2 = false;
        String str2 = Boolean.toString(boovar2);
        System.out.println("String2 is: "+str2);
    }
}