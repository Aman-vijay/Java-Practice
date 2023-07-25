
package Function;
import java.util.*;
public class armStrong {
    
    static Boolean isarm(int x){
        int trueX = x;
        
        int val = 0;
        while(x>0){
           int temp = x%10;
           temp = temp*temp*temp;
            val = val + temp;
            x = x/10;

        }
        return val == trueX;
        // if(val==trueX){
        //     return true;
        // }
        // return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        
        for(int i=100;i<1635;i++){
            if(isarm(i)){
                System.out.print(i + "   ");
            }
        }
        // System.out.println(isarm(num));
    }
}
