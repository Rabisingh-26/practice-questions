// Happy Numbers up to N
import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int current = i;

            while (current != 1 && current != 4) {
                int sum = 0;
                int temp = current;

                while (temp > 0) {
                    int digit = temp % 10;
                    sum = sum + (digit * digit);
                    temp = temp / 10;
                }

                current = sum;
            }

            boolean isHappy = (current == 1);

            if (isHappy) {
                System.out.print(i + " ");
            }
        }

        
    }
}