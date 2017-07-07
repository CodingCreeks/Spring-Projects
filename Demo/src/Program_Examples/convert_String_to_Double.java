package Program_Examples;

public class convert_String_to_Double {

		   public static void main(String args[]){
		       //Using parseDouble
		       String str="122.202";
		       Double var= Double.parseDouble(str);
		       System.out.println(var);
		       
		       //Using Double class constructor
		       String str2="122.202";
		       Double var2= new Double(str2);
		       System.out.println(var2);

		       //Using valueOf method
		       String str3="122.202";
		       Double var3= Double.valueOf(str3);
		       System.out.println(var3);
		   }
		}
