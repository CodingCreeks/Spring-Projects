package Program_Examples;
public class PadRightExample2 {
  public static void main(String[] argv) {
    System.out.println("#" + rightPadZeros("mystring", 10) + "@");
    System.out.println("#" + rightPadZeros("mystring", 15) + "@");
    System.out.println("#" + rightPadZeros("mystring", 20) + "@");
  }

  public static String rightPadZeros(String str, int num) {
    return String.format("%1$-" + num + "s", str).replace(' ', '0');
  }
}