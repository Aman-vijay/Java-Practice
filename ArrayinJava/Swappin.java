package ArrayinJava;
import java.util.*;
public class Swappin {

    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
       
    }
    public static void main(String[] args) {
        
    
    int[] arr1 = {5,7,8,9};
    
    // System.out.println("Enter the array of size 4:");
    // Scanner sc = new Scanner(System.in);
    // for (int num:arr1){
    //     num = sc.nextInt();
    //     // System.out.print(num + " ");

    // }
    // System.out.println("Enter the number of index you want to swap:");
    // int x = sc.nextInt();
    // System.out.println("Enter the number of index you want to swap with:");
    // int y = sc.nextInt();
     swap(arr1,1,2);
     System.out.print(Arrays.toString(arr1));
    }
}
