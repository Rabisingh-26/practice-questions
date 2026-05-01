//Sum of natural numbers
import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<n;i++){
            sum = n*(n+1)/2;
        //   System.out.println(sum);
        }
          System.out.println(sum);
        
      sc.close();
    }
}

