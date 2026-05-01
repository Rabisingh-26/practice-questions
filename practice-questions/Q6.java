//Greatest Common Divisor
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value:");
        int a = sc.nextInt();
        System.out.println("enter the second value:");
        int b = sc.nextInt();
         
       while(b!=0){
        int rem = a%b;
        a = b;
        b = rem;
       }
       System.out.println("GCD:"+a);
    }
}
