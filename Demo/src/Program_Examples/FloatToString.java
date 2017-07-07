package Program_Examples;
public class FloatToString {
    public static void main(String[] args) {
        /* Method 1: using valueOf() method
         * of String class.
         */
        float fvar = 1.17f;
        String str = String.valueOf(fvar);
        System.out.println("String is: "+str);
        
        /* Method 2: using toString() method 
         * of Float class
         */
        float fvar2 = -2.22f;
        String str2 = Float.toString(fvar2);
        System.out.println("String2 is: "+str2);
    }
}