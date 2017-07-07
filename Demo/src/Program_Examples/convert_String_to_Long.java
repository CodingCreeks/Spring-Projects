package Program_Examples;

public class convert_String_to_Long {
	   public static void main(String[] args)
	   {
	       String str="203456";
	       //Conversion using parseInt method
	       long num = Long.parseLong(str);
	
	       //Conversion using valueOf method
	       long num2 = Long.valueOf(str);
	
	       //Conversion: Long(String s) constructor
	       long num3 = new Long(str);
	
	       //Displaying variables values
	       System.out.println(num);
	       System.out.println(num2);
	       System.out.println(num3);		
	   }
	}


