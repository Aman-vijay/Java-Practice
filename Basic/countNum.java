package Basic;
import java.util.*;
public class countNum {
    public static void main(String[] args) {
        
  
    Scanner sc =  new Scanner(System.in);
    int count = 0;
    int temp = 0;
    int num = sc.nextInt();
    int x = sc.nextInt();
    while(num>0){
        temp = num%10;
        if(temp ==x){
            count=count+1;
        }
        num = num/10;
    }
    System.out.println(count);
    sc.close();
      }
      
}

