
//Factorial Calculation
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" N:");
        int n = sc.nextInt();
        int fact=1;
         
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);

      
    }
}
