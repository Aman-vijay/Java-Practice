package ArrayinJava;

import java.util.Arrays;
import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
    //    int[] arr1 = new int[5];
       
    //    for(int i=0;i<arr1.length;i++){
              
    //            arr1[i] = sc.nextInt();
    //    }
    //    System.out.println(Arrays.toString(arr1));
    //    for(int num:arr1){
    //     System.out.println(num);
    //    }

    //Array of Objects
    String[] str = new String[4];
    for(int i =0; i<str.length;i++){
     str[i] = sc.next();}
    
    System.out.print(Arrays.toString(str));
}
}

