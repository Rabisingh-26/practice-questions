//Narcissistic Number
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int original = n;

  
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }

       
        n = original;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power*digit;
            }

            sum = sum + power;
            n = n / 10;
        }

      
        if (sum == original) {
            System.out.println("Narcissistic Number");
        } else {
            System.out.println("Not a Narcissistic Number");
        }
    }
}
