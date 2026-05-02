//Sum of elements in the array
import java.util.*;
public class Q16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements:");
        int n = sc.nextInt();
     
        int sum = 0;
        System.out.print("Array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int j=0;j<n;j++){
             sum = arr[j] +sum;
        }
        System.out.println(sum);
    
    }
}