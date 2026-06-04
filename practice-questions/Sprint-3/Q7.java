
// Number sprial matrix
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int count = 1;

        while (top <= bottom && left <= right) {

            // Top row
            for (int i = left; i <= right; i++) {
                arr[top][i] = count++;
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = count++;
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = count++;
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = count++;
                }
                left++;
            }
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
