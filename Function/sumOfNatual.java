package Function;
import java.util.*;
public class sumOfNatual {
    static int sumOf(int x){
          int val =x;
          while(x>0){
            
            val += (x-1);
            x--;
          }
          return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOf(num));
    }
}
