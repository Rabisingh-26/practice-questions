//Cross Pattern in a Matrix
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("N:");
    int n = sc.nextInt();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==n/2 || j==n/2){
                System.out.print("*");
                
            }
            else{
                System.out.print(" ");
            }
        
        }
          System.out.println();
    }
  

}
}
