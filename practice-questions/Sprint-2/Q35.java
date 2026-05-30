// keith number checker
import java.util.*;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int n = sc.nextInt();

        int original = n;

        
        int count = 0;
        int temp = n;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int d = count;

        
        int[] sequence = new int[d];
        temp = n;

        for (int i = d - 1; i >= 0; i--) {
            sequence[i] = temp % 10;
            temp /= 10;
        }

        int sum = 0;

        while (true) {

            
            sum = 0;
            for (int i = 0; i < d; i++) {
                sum += sequence[i];
            }

            if (sum == original) {
                System.out.println("Keith Number");
                return;
            }

            if (sum > original) {
                System.out.println("Not a Keith Number");
                return;
            }

            // Shift left
            for (int i = 0; i < d - 1; i++) {
                sequence[i] = sequence[i + 1];
            }

            // Put new term at end
            sequence[d - 1] = sum;
        }
    }
}