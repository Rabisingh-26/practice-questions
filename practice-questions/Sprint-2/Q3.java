
//Modular Arithmetic
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:");
        long a = sc.nextInt();
        System.out.print("Enter the exponent:");
        long b = sc.nextInt();
        System.out.print("Enter the modulus:");
        long m = sc.nextInt();
       
        long temp=1;
        if(m!=0){
            for(int i=1;i<=b;i++){
            temp = (temp*a)%m;
        }
        System.out.println("Result: "+temp);
        }
   
    
  
       
 

    }
}
