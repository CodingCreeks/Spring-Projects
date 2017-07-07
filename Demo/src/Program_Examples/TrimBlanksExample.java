package Program_Examples;
class TrimBlanksExample {
  public static void main(String[] args) {
    System.out.println("#"+trimTrailingBlanks(" How are you??    ")+"@");
    System.out.println("#"+trimTrailingBlanks("                  I'm Fine. ")+"@");
  }

  public static String trimTrailingBlanks(String str)
  {
    if(str == null)
      return null;
    int len = str.length();
    for( ; len > 0; len--)
    {
      if( !Character.isWhitespace(str.charAt(len-1)))
         break;
    }
    return str.substring(0,len);
  } 
}