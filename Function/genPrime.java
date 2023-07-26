package Function;
import java.util.*;
public class genPrime {
    static Boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int x =2;x<num; x++){
            if(num%x ==0){
                return false;
            }
        
           
        }
            return true;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a  =   sc.nextInt();
    int z  =   sc.nextInt();

    for (int i = a ; i<z ; i++){
        if(isPrime(i)){
            System.out.print(i + " ");
        }
    }
}}
