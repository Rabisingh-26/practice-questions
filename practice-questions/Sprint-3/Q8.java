import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows:");
        int n = sc.nextInt();

        int[][] triangle = new int[n][n];
        int[] prev = new int[n];

        System.out.println("\nPascal's triangle");

        // =========================
        // Generate Pascal Triangle
        // =========================
        for (int i = 0; i < n; i++) {

            int[] curr = new int[n];

            curr[0] = 1;
            curr[i] = 1;

            for (int j = 1; j < i; j++) {
                curr[j] = prev[j - 1] + prev[j];
            }

            // store row
            triangle[i] = curr;

            // print row
            for (int j = 0; j <= i; j++) {
                System.out.print(curr[j] + " ");
            }
            System.out.println();

            prev = curr;
        }

        // =========================
        // Property 2: Row Sum = 2^i
        // =========================
        System.out.println("\nProperty 2: Row Sum Verification");

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j <= i; j++) {
                sum += triangle[i][j];
            }

            int expected = (int) Math.pow(2, i);

            if (sum == expected) {
                System.out.println("Row " + i + ": " + sum + " = 2^" + i);
            } else {
                System.out.println("Row " + i + " FAILED");
            }
        }

        // =========================
        // Property 3: Power of 11 pattern
        // =========================
        System.out.println("\nProperty 3: Power of 11 Verification");

        for (int i = 0; i < n; i++) {

            long num = 0;

            for (int j = 0; j <= i; j++) {
                num = num * 10 + triangle[i][j];
            }

            long expected = (long) Math.pow(11, i);

            if (i <= 9 && num == expected) {
                System.out.println("Row " + i + ": " + num + " = 11^" + i);
            } else if (i > 9) {
                System.out.println("Row " + i + ": skipped (overflow risk)");
            } else {
                System.out.println("Row " + i + ": " + num + " vs 11^" + i + " = " + expected);
            }
        }
    }
}