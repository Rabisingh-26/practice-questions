
//Fibonacci triangle
import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows:");
        int rows = sc.nextInt();

        int first = 1;
        int second = 1;
        int next;
        //each rows
        for(int i=1;i<=rows;i++){

   
            for(int j=1;j<=i;j++){
              
                System.out.print(first+ " ");
                next = first + second;
                first = second;
                second = next;
               
            }  
               
            System.out.println();
        }
    }
    
}
