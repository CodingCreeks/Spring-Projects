package Program_Examples;
public class PadRightExample1 {
  public static void main(String[] argv) {
    System.out.println("#" + rightPadding("mystring", 10) + "@");
    System.out.println("#" + rightPadding("mystring", 15) + "@");
    System.out.println("#" + rightPadding("mystring", 20) + "@"); 
  }

  public static String rightPadding(String str, int n) {
    return String.format("%1$-" + n + "s", str);
  }
}