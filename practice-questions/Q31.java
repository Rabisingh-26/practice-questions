// Perfect Number 
import java.util.*;
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exp = sc.nextInt();

        //int result = (int) Math.pow(base,exp);
        //System.out.println("Result: "+result);
        int result=1;
        for(int i=1;i<=exp;i++){
            result = result*base;
            
        }
        System.out.println(result);
    }
}
