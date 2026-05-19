//Finding the Prime Numbers in a given range
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i=x;i<=y;i++){
            boolean isPrime = true;
             if(i<=1){
                isPrime = false;

             }
    
             for(int j=2;j<i;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
           
             }
              if(isPrime){
                 System.out.print(i);
            
        }
     
        }
    }
}
