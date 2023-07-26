package Function;
import java.util.*;
public class factorial {

    static int factOf(int x){
        int prod =1;
        while(x>0){
            prod *= x;
            x--;
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factOf(num));
    }
}
