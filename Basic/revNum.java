package Basic;
import java.util.Scanner;

public class revNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int val =0;
        // int temp = num%10;
        while(num>0){
            int x = num%10;
            num = num/10;
            val = val*10+x;
            
        
        }
        
        System.out.println(val);
    }
}
