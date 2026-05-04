
//Pattern
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows:");
        int rows = sc.nextInt();
        int n =1;
        for(int i =1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n +" ");
                n++;

            }
           System.out.println();
        }
    }
}
