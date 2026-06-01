// The Staircase Number Pattern (Left and Right)
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int n = sc.nextInt();

        //Left aligned staircase
        System.out.println("Left aligned staircase:");
        for(int i=1;i<=n;i++){//current row

            for(int j=1;j<=i;j++){//value printing

                System.out.print(j);
            }
            System.out.println();

        }

        //right align staircase
        System.out.println("Right align staircase");

        for(int i=1;i<=n;i++){//current row

            for(int j=1;j<=n-i;j++){//spaces
               System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
        
            System.out.println();

        }
    }
    
}
