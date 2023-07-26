package ArrayinJava;
import java.util.Arrays;;
public class arrFunc {
    static void val (String[] str){
         str[3] = "yo";
    }
    public static void main(String[] args) {
        String con[] = {"jai","shri","ram","ji"};
        val(con);
        System.out.print(Arrays.toString(con)); 
    }
}
