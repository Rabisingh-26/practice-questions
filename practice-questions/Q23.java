// Counting the digits of the number

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            n = n / 10; // remove last digit
            count++;
        }

        System.out.println(count);
    }
}
