
//Smith Number Generator

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        int sum1 = 0;

        while (temp > 0) {
            sum1 += temp % 10;
            temp /= 10;
        }

        int sum2 = 0;

        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {

                int x = i;

                while (x > 0) {
                    sum2 += x % 10;
                    x /= 10;
                }

                n /= i;
            }
        }

        System.out.println(sum1 == sum2);
    }
}