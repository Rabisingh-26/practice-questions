
//Game of Life
import java.util.*;
public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the array:");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] next = new int[n][n];

        int[][] dirs = {
            {-1,-1},{-1,0},{-1,1},
            {0,-1},       {0,1},
            {1,-1},{1,0},{1,1}
        };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int count = 0; // RESET HERE

                for (int[] d : dirs) {

                    int ni = i + d[0];
                    int nj = j + d[1];

                    if (ni >= 0 && nj >= 0 && ni < n && nj < n) {
                        count += arr[ni][nj]; // FIXED
                    }
                }

                if (arr[i][j] == 1) {
                    if (count == 2 || count == 3)
                        next[i][j] = 1;
                    else
                        next[i][j] = 0;
                } 
                else {
                    if (count == 3)
                        next[i][j] = 1;
                    else
                        next[i][j] = 0;
                }
            }
        }

        // print result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(next[i][j] + " ");
            }
            System.out.println();
        }
    }
}