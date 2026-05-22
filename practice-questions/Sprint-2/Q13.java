//Chessboard number pattern with 0's and 1's
import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the columns:");
        int col = sc.nextInt();

        int k =1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=col;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
              
                
             }
             System.out.println();
        }
    }
    
}
