
// Pascal's traingle
import java.util.*;
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr[0] = 1;
        for(int i=1;i<n;i++){ // rows
        
             for(int j=i;j>0;j--){ //elements
                 arr[j] = arr[j] + arr[j-1]; 
             }
             for(int j=0;j<=i;j++){
                System.out.print(arr[j] + " ");
             }
             System.out.println();
        }
    }
}
