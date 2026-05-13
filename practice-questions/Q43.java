//Finding the Mode of Numbers in an Array
import java.util.*;
public class Q43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int count =0;
        int mode = arr[0];
        for(int j=0;j<arr.length;j++){
            int temp =0;
           for(int z=0;z<arr.length;z++){
            if(arr[j] == arr[z]){
                temp++;

            }
            if(temp>count){
                count = temp;
                mode = arr[j];
              
            }

           }
          
        }
         System.out.println(mode);

    }
}