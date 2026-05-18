//Square numbers
import java.util.*;
public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int n = sc.nextInt();
         
        int n1= (int)Math.sqrt(n);
        if(n1 * n1 == n){
           System.out.println( "perfect sqaure ");
        }
        else{
            System.out.println("not perfect square");
        }
    }
}
