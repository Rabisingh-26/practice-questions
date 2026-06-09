//Magic Square Generator (Siamese Method)
import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        if(n%2==0){
            System.out.println("Enter ODD number");
        }
        else{
        
        int row = 0;
        int col = n/2;

        for(int i=1;i<=n*n;i++){
            arr[row][col] = i;

            int nextrow = (row-1+n)%n;
            int nextcol =  (col+1)%n;

            if(arr[nextrow][nextcol]!=0){
                row = (row+1)%n;
            }

            else{
            row = nextrow;
            col =nextcol; 
            }


        } 

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }

    }
    
        int magicconstant = n*(n*n +1)/2;
        System.out.println("constant: "+magicconstant);
        
    }
}
