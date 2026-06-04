//Diagonal Traversal of Matrix

import java.util.*;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        // input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxDiag = (m - 1) + (n - 1);

        for (int d = 0; d <= maxDiag; d++) {

            int[] temp = new int[m * n]; // max possible size
            int k = 0;

            // collect diagonal elements
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (i + j == d) {
                        temp[k++] = arr[i][j];
                    }
                }
            }

            // print zigzag
            if (d % 2 == 0) {
                for (int i = 0; i < k; i++) {
                    System.out.print(temp[i] + " ");
                }
            } else {
                for (int i = k - 1; i >= 0; i--) {
                    System.out.print(temp[i] + " ");
                }
            }
        }
    }
}