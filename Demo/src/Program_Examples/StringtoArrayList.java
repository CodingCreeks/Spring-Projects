package Program_Examples;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class StringtoArrayList {
    public static void main(String args[]){
        String num = "22,33,44,55,66,77";
        String str[] = num.split(",");
        
        List<String> al = new ArrayList<String>();
        al = Arrays.asList(str);
        for(String s: al){
            System.out.print(" "+s);
        }
    }
}