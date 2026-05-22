// Alphabet Pyramid
import java.util.*;
public class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){//Rows

           for(int k =1;k<n-i;k++){ //spaces
            System.out.print(" ");
           }

            char ch ='A';
           for(int j=1;j<=i;j++){
           System.out.print(ch);
           ch++;
           
           }
           ch--;
           for(int j=i-1;j>=1;j--){
            ch--;
            System.out.print(ch);
          
           
        }
           System.out.println();
   
    }
}
}