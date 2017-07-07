package Program_Examples;
class LeftPaddingExample1 {
  public static void main(String[] args) {
    System.out.println("#" + padLeftSpaces("mystring", 10) + "@");
    System.out.println("#" + padLeftSpaces("mystring", 15) + "@");
    System.out.println("#" + padLeftSpaces("mystring", 20) + "@");
  }

  public static String padLeftSpaces(String str, int n) {
    return String.format("%1$" + n + "s", str);
  }
}