//Rotate Matrix 90° Clockwise In-Place
import java.util.*;

public class Q10{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        int[][] a = new int[n][n];

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Step 1: transpose (in-place)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Step 2: reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            while (left < right) {
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;

                left++;
                right--;
            }
        }

        // print result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}