package ArrayinJava;

import java.util.Arrays;

public class reverse {
    static void rev(int[] arr2){
        int start = 0;
        int end = arr2.length-1;
        while(end>start){
            swap(arr2, start, end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr ,int x,int y){
       int temp = arr[x];
       arr[x] = arr[y];
       arr[y] = temp;
    }
    public static void main(String[] args) {
        int[] arr1 = {5,7,8,9,10};
        rev(arr1);
        System.out.println(Arrays.toString(arr1));
        }
    
}
