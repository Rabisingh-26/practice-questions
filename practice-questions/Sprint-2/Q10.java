//Pascal's Triangle
import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of rows:");
        int n = sc.nextInt();
        
      int[] prev = new int[1];
      prev[0] = 1;
      for(int i=1;i<=n;i++){
        int[] curr = new int[i];
        curr[0] = 1;
        curr[i-1] = 1;

      for(int j=1;j<i-1;j++){
        curr[j] = prev[j-1] + prev[j];

      }
           for (int s = 0; s < (n - i); s++) {
                System.out.print("    ");
            }

      for(int j=0;j<i;j++){
        System.out.print(curr[j] + "    ");
      }
      System.out.println();
      prev =  curr;

      }

        
    }

}