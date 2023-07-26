package Function;
import java.util.*;


public class isPalindrome {
static Boolean isPal(int x){
    int original = x;
    int val = 0;
    while(x>0){
        int temp = x%10;
        val = val*10 + temp;
        x = x/10;
        
        
    }
    return val == original;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPal(n));
    }
    
}
