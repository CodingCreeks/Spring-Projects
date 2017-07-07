package Program_Examples;
class StringObjToBooleanObj {
   public static void main(String[] args) {
      // String Objects
      String str = "false";
	    
      // Case does not matter for conversion
      String str2 = "TrUe";
	   
      /* Method 1: Using Constructor - 
       * Passing string value to the constructor
       * of Boolean class.
       */
      Boolean bobj = new Boolean(str);
      Boolean bobj2 = new Boolean(str2);
      System.out.println(bobj);
      System.out.println(bobj2);
	   
      /* Method 2: Using valueOf() method of
       * Boolean class
       */
      Boolean bobj3 = Boolean.valueOf(str);
      Boolean bobj4 = Boolean.valueOf(str2);
      System.out.println(bobj3);
      System.out.println(bobj4);
  }  
}