//Hourglass of Stars
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows:");
        int n =  sc.nextInt();
     
  
        for(int i=1;i<=n/2+1;i++){ //rows 


            for(int j=2;j<=i-1;j++){//Spaces
                System.out.print(" ");
            }
            //Printing stars in each row
            for(int k=1;k<= n-2*(i-1);k++){
                System.out.print("*");
            }
      
            System.out.println();
            
        }

        for(int i=n/2;i>=1;i--){

            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-2*(i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

  
    }
}
