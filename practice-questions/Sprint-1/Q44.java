//Determining the Length of a String Without Using Built-In Functions
import java.util.*;
public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        
       int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            count++;

        }
        System.out.println(count);
    }
}
