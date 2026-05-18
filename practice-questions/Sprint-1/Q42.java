//Finding the Average of Numbers in an Array
import java.util.*;
public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int avg=0;
        int sum =0;
        for(int j=0;j<arr.length;j++){
            sum = sum + arr[j];
            avg = sum/n;
         
        }
        System.out.println("avg:"+avg);

    }
}
