package Program_Examples;
import java.io.StringWriter;

public class WriterToString {
    public static void main(String args[]){
        // create a new writer
          StringWriter sw = new StringWriter();

          // append a char       
          sw.append("abc");
          sw.append(" xyz");
          
          String str = sw.toString();
          System.out.println(str);
    }
}