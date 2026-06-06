//All Perfect Numbers up to N
import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            
            boolean isPerfect = false;
            int temp =i;
            int sum =0;
           for(int j=1;j<temp;j++){
        
            if(temp%j==0){
                sum = sum +j;
            }

        }

           if(sum==temp){
                isPerfect = true;
           }
           if(isPerfect){
               System.out.print(i);
        }
   
        }
        
    }
}
