import java.util.Scanner;

public class Q33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Enter maximum steps: ");
        int k = sc.nextInt();

        boolean isLychrel = true;

        for (int i = 1; i <= k; i++) {

        
            int temp = n;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            
            n = n + reverse;

            
            temp = n;
            reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            if (n == reverse) {
                isLychrel = false;
                break;
            }
        }

        System.out.println(isLychrel);
    }
}