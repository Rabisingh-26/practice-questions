
// Displaying matrix grid
import java.util.*;
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int num=1;
        for(int j=1;j<=n;j++){

        for(int i =1;i<=n;i++){
          System.out.print(num + "");
          num++;
        }
        System.out.println();
    }
    }
}
