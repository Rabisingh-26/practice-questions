
//Finding GCD of two given numbers
import java.util.*;
public class Q2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers:");
    int x= sc.nextInt();
    int y= sc.nextInt();
    
    while(y!=0){
        int temp = y;
        y = x%y;
        x=temp;

    }
    System.out.println("GCD:- "+x);
   } 
}
