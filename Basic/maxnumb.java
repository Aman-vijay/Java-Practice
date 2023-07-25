package Basic;

import java.util.Scanner;

// static void maximum(int x,int y, int z){
//    int max = 0;
// }


public class maxnumb{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =0;
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();

        max = a;
        if(b>max){
            max=b;
        }
            if(c>max){
                max =c;
            }
        System.out.println("Maximum value is :" + max);   
        sc.close(); 
    }
}