// find out all the prime numbers in the given range and then add them.
import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Start:");
        int start = sc.nextInt();

        System.out.println("End:");
        int end = sc.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {

            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false;
            } else {

                for (int j = 2; j <= Math.sqrt(i); j++) {

                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of prime numbers: " + sum);
    }
}