// Diamond of stars
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows(odd):");
        int n = sc.nextInt();

        int mid =(n+1)/2;
        for(int i=1;i<=mid;i++){

            for(int j=1;j<=mid-1;j++){
                System.out.print(" ");
            }
            for(int k =1;k<= (2*i -1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=mid-1;i>=1;i--){

            for(int j=1;j<=mid-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }



        }
    }

