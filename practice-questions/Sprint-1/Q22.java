//Finding prime numbers which are smaller than the given number 

import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("No primes");
        } else {
            for (int i = 2; i < n; i++) {

                boolean isPrime = true; 

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
    }
}