
//Break the number into digits, square each digit, and then sum them all up
import java.util.*;
public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
         int digit =0;
         int square=1;
         int sum=0;

       while(n>0){
        digit = n%10;
        square = digit * digit;
        sum =sum + square;
        n=n/10;
     
     
       }
       
        System.out.println("Result: " + sum);

    }
}
