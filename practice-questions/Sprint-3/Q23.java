//Product of Array Except Self
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] prefixProduct = new int[n];
        prefixProduct[0] = 1;
        for(int i =1;i<n;i++){
            prefixProduct[i] = prefixProduct[i-1]*arr[i-1];
        }

        int[] suffixProduct = new int[n];
         suffixProduct[n-1] = 1;
        for(int j=n-2;j>=0;j--){
            suffixProduct[j] = suffixProduct[j+1]*arr[j+1];

        }
 
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = prefixProduct[i] * suffixProduct[i];
             System.out.print(result[i] + " ");
        }
       
       
    }
}
