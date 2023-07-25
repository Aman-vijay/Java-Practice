package Basic;
// Method 1 (Using Recursion)
import java.util.*;

// public class Fibonacci {
    
//      static int fib(int count){
//     int f1=0;int f2=1;int f3=0;
//     while(count>0){
//     f3 = f1+f2;
//      f1 = f2;
//      f2=f3;
     
//      count --;
//     }
//      return f3;

//  }
//  public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     System.out.println(fib(n)-(n-1));
//     sc.close();
//  }
 
    
// }

//Method 2 

public class Fibonacci{
      public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
      int n = sc.nextInt();
      int a = 0;
      int  b = 1;
      int count = 0;
      while(count<n){
         int temp = b;
         b = b+a;
         a=temp;
         count++;
      }
      System.out.println(b);
   }
}