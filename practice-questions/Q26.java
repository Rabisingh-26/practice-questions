//Calculating the sum of factorial
import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number:");
        int n = sc.nextInt();
        int fact = 1;
        int sum = 0;
        int digit = 0;
        for(int i =1;i<=n;i++){
         fact = fact*i;
         
        }
        System.out.println(fact);
        while(fact > 0){
            digit = fact%10;
            sum = sum +digit;
            fact = fact/10;


        }
         System.out.println(sum);

    }
}
