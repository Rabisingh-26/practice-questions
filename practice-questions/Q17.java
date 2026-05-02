
//Armstrong Number
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first limit:");
        int a = sc.nextInt();

        System.out.println("Enter the second limit:");
        int b = sc.nextInt();

        for (int n = a; n <= b; n++) {

            int temp = n;
            int digits = 0;
            int sum = 0;

        
            int t = temp;
            if (t == 0) {
                digits = 1;
            } else {
                while (t != 0) {
                    t = t / 10;
                    digits++;
                }
            }

      
            t = temp;


            while (t != 0) {
                int digit = t % 10;

                int power = 1;
                for (int i = 1; i <= digits; i++) {
                    power *= digit;
                }

                sum += power;
                t = t / 10;
            }

            // special case for 0
            if (n == 0) {
                sum = 0;
            }

            if (sum == n) {
                System.out.println("Armstrong number: " + n);
            }
        }
    }
}