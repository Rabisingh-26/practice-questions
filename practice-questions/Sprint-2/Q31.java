//The Kaprekar’s Constant
import java.util.*;
public class Q31 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int count = 0;

        while (n != 6174) {

            int[] arr = new int[4];
            int temp = n;

            for (int i = 0; i < 4; i++) {
                arr[i] = temp % 10;
                temp = temp / 10;
            }

            Arrays.sort(arr);

            int asc = 0;
            for (int i = 0; i < 4; i++) {
                asc = asc * 10 + arr[i];
            }

       
            int desc = 0;
            for (int i = 3; i >= 0; i--) {
                desc = desc * 10 + arr[i];
            }

            n = desc - asc;
            count++;

            if (n == 0) break;
        }

        System.out.println(count);
    }
}

