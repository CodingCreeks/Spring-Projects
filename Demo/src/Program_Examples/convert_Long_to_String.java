package Program_Examples;
public class convert_Long_to_String {
    public static void main(String[] args) {
        
        /* Method 1: using valueOf() method of String class */
        long lvar1 = 123;
        String str = String.valueOf(lvar1);
        System.out.println("String is: "+str);
        
        /* Method 2: using toString() method of Long class  */
        long lvar2 = 200;
        String str2 = Long.toString(lvar2);
        System.out.println("String2 is: "+str2);
    }
}