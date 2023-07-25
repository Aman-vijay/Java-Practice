package Basic;
import java.util.*;
public class alphabetCase {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char c = sc.nextLine().trim().charAt(0);
    if(c>='a' && c< 'z'){
        System.out.println("Lowercase");
    }
    else{
        System.out.println("Uppercase");
    }
}
}