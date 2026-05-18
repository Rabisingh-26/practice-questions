
// Median of a given array
import java.util.*;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array: ");
        int n = sc.nextInt();
        // Array input
        
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);

        for(int i =0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
        n = arr.length;
        if(n%2 == 1){
            int median = arr[n/2];
            System.out.println("Median: " +median);
        }
        else{
            int median = (arr[n/2 -1]+arr[n/2])/2;
            System.out.println("Median: " +median);
        }


    }
}
