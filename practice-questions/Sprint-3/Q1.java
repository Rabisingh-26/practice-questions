// The Symmetric Hourglass Pattern
import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int n = sc.nextInt();

        //upper half
        for(int i=1;i<=(n+1)/2;i++){

            //spaces
            for(int j=1;j<=2*i;j++){

                System.out.print(" ");

            }
            for(int s=1;s<=n-2*(i-1);s++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i =(n+1)/2-1;i>=1;i--){

            for(int j=1;j<=2*j;j++){

                System.out.print(" ");
            }
            for(int s=1;s<=n-2*(n-1);s++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}