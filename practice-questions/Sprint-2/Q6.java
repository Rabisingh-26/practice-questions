
//Finding the area of polygon
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of coordinates: ");
        int n = sc.nextInt();
    
        int[][] arr = new int[n][2] ;
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
          
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n-1;i++){
         sum1 = sum1 + (arr[i][0] * arr[i+1][1]);
         sum2 = sum2 + (arr[i][1] * arr[i+1][0]);

        }

        sum1 = sum1 + (arr[n-1][0] * arr[0][1]);
        sum2 = sum2 + (arr[n-1][1] * arr[0][0]);

        double result =Math.abs(sum1 - sum2)/2.0;
        System.out.println("Result: "+ result);
    
    }
}
