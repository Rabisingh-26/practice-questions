
// Happy Checker
import java.util.*;

public class Q18 {

    static int squareSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum = sum + (digit * digit);

            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        while (n != 1 && n != 4) {

            n = squareSum(n);
        }

        if (n == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}