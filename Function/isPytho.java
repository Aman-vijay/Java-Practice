package Function;
import java.util.*;
public class isPytho {

    static Boolean isPyTrip(int x, int y , int z ){
        return (x*x)+(y*y) == (z*z);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(isPyTrip(a,b,c));
    }
}
