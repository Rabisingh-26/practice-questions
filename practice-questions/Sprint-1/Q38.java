
// converting a number in single digit
import java.util.*;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
       
        while (n>=10) {
            int sum =0;
            while(n>0){
                int digit = n%10;
                sum = sum + digit;
                n = n/10;

            }
            n = sum;
            
        }
        System.out.println(n);

        
    }
            
    }

