
//Number Base Staircase
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Limit:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Binary
            int temp = i;
            String binary = "";

            while (temp > 0) {
                int rem1 = temp % 2;
                binary = rem1 + binary;
                temp = temp / 2;
            }

            // Octal
            temp = i;   // RESET
            String octal = "";

            while (temp > 0) {
                int rem2 = temp % 8;
                octal = rem2 + octal;
                temp = temp / 8;
            }

            // Hexadecimal
            temp = i;   // RESET
            String hexa = "";

            while (temp > 0) {
                int rem3 = temp % 16;

                if (rem3 < 10) {
                    hexa = rem3 + hexa;
                } else {
                    hexa = (char) (rem3 - 10 + 'A') + hexa;
                }

                temp = temp / 16;
            }

            // Output
            System.out.println(i + ":" + binary + "/" + octal + "/" + i + "/" + hexa);
        }
    }
}