//Reverse the given string
import java.util.*;
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String str = sc.nextLine();


        String reverse=" ";
        for(int i =str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed String:"+reverse);
    }
}
