package Function;
import java.util.*;


public class Prime {

    static Boolean isPrime(int a){
       if (a<=1)
        return false;
        
       for (int i = 2; i<a;i++){
        if(a%i==0){
            return false;
        }
       
        }
         return true;
    
       
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num =  sc.nextInt();
        System.out.println(isPrime(num));
    }
}
