//The Harshad Number Checker
import java.util.*;
public class Q34 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int n = sc.nextInt();

    int sum =0;
    int temp = n;
    if(n>0){
    while(temp>0){
        int lastdigit = temp%10;
        sum = sum + lastdigit;
        temp = temp/10;

    }
    if(n%sum == 0){
        System.out.print("true");
    }
    else{
        System.out.print("false");
    }
}
else{
    System.out.println("n must be greater than zero");

}
   } 
}
