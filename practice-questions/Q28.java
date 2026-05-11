// Missing numbers
import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sequence: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int last = arr[arr.length - 1];
        
        for(int i=1;i<=last;i++){

            boolean  found =false;
            for(int j=0;j<arr.length;j++){
              if(arr[j] ==i){
                found =true;
                break;

              }
            //  System.out.println(j);

            }
            if(found == false){
            System.out.println("Missing Number:" + i);
        }
        }
        
        
        
        
        }
}
