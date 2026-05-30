//Mersenne Prime Checker
import java.util.*;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int n = sc.nextInt();
        int x=n+1;

        int p=0;
        //finding the value of p
       
    
        while(x%2==0){
            x=x/2;

            p++;
        }
        if(x != 1){
            System.out.println(false);
            return;
        }
        boolean isPrime = true;
        if(p<=1){
            isPrime = false;
        }
        else{
            for(int i=2;i*i<=p;i++){
                if(p%i==0){
                    isPrime = false;
                    break;

                }
            }
        }

System.out.println(isPrime);
        
    }
}
