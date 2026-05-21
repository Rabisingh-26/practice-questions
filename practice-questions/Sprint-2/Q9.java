
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of n:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              System.out.print("1");
              
            }
            for(int k=1;k<=i;k++){
                System.out.print("0");
               
            }
             System.out.println();

        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("1");
            }
            for(int k=1;k<=i;k++){
                System.out.print("0");
            }
            System.out.println();
        }

         
    
    }
}
