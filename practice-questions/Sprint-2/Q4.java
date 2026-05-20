// Finding coprime numbers upto N
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of N:");
        int n = sc.nextInt();
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();

       
        int x = a;
        int y = b;

         while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;  
         }
   
        int  gcd = a;
     
        int lcm =(x*y)/gcd;
        int count=0;
         for(int i =1;i<=n;i++){
            int p = i;
            int q =lcm;
           
            while(q!=0){
                int temp = q;
                q = p%q;
                p =  temp;
            }
            if(p==1){
                count++;
                
            }
        
         }
         System.out.println(count);

        }
    }

