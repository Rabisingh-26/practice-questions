
//Goldbach’s Conjecture Verifier
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {

            boolean prime1 = true;
            boolean prime2 = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime1 = false;
                }
            }

            int second = n - i;

            for (int j = 2; j < second; j++) {
                if (second % j == 0) {
                    prime2 = false;
                }
            }

            if (prime1 && prime2) {
                System.out.println(i + " " + second);
                break;
            }
        }
    }
}
