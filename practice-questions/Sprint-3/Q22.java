//Zigzag Array Arrangement
import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){

            if(i%2==0){
                int temp1=0;
                if(arr[i]>arr[i+1]){

                    temp1 = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] =temp1;
                }
            }
            else{
                int temp2=0;
                if(arr[i]<arr[i+1]){
                    temp2= arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp2;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
