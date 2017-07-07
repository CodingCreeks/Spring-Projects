package Program_Examples;
class CharArrayToString
{
   public static void main(String args[])
   {
      // Method 1: Using String object
      char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
      String str1 = new String(ch);
      
      System.out.println(str1);
 
      // Method 2: Using valueOf method
      String str2 = String.valueOf(ch);
      System.out.println(str2);
   }
}