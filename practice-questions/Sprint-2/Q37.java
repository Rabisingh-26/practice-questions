//The Euler’s Totient Function Calculator
import java.util.*;

public class Q37 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the limit:");
    int  n = sc.nextInt();

    int count =0;
    for(int i =1;i<=n;i++){

        int a =i;
        int b =n;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
            
        }
         if(a==1){
            count++; 
        }  
    }
    System.out.println(count);
   
   } 
}
