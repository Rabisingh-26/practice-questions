//Cross of Primes
import java.util.*;
public class Q16 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers requires:");
        int n = sc.nextInt();

        
        int[] arr = new int[n];
        int count=0;
        int num =2;
        while(count<n){

            boolean isPrime = true;

            for(int i=2;i<num;i++){
                if(num%i ==0){
                    isPrime = false;
                    break;
                }
            }
            
                if(isPrime){
                    arr[count] = num;
                    count++;
                }
                num++;
            }
           int center = arr[n-1];

           for(int i=1;i<=n/2;i++){

            for(int j=1;j<=n-1;j++){
                System.out.print("  ");
            }
            System.out.println(center);
           }

           for(int i=0;i<n;i++){
            System.err.print(arr[i]+ " ");
           }
           System.out.println();

           for(int i=1;i<=n/2;i++){
            for(int j=1;j<=n;j++){
                System.out.print("  ");
            }
            System.out.println(center);
           }

     }
    
}
