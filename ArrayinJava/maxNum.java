package ArrayinJava;
public class maxNum {
    static int maxoF(int[] arr){
        int temp =Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
              if(arr[i]>temp){
                temp = arr[i];
              }
                   
                   
              }
              return temp;
              
        }
        
    
    public static void main(String[] args) {
        int[] arr1 = {7,20,9,10,11,12,15};
        System.out.println(maxoF(arr1));
    }
}
