//Matrix Diagonal Sum and Saddle Point
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Size of the array:");
    int n = sc.nextInt();

    int[][] arr = new int[n][n];

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }

     int sum =0;
    for(int k=0;k<n;k++){
   
        for(int j=0;j<n;j++){
            if(k==j){
                sum = sum +arr[k][j];
            }
        }
     
    }
       System.out.println(sum);
    
       boolean found = false;

for(int i = 0; i < n; i++) {

    // Find minimum element in current row
    int minValue = arr[i][0];
    int minCol = 0;

    for(int j = 1; j < n; j++) {
        if(arr[i][j] < minValue) {
            minValue = arr[i][j];
            minCol = j;
        }
    }

    // Find maximum element in that column
    int maxInColumn = arr[0][minCol];

    for(int k = 1; k < n; k++) {
        if(arr[k][minCol] > maxInColumn) {
            maxInColumn = arr[k][minCol];
        }
    }

    // Check saddle point condition
    if(minValue == maxInColumn) {
        System.out.println("Saddle Point: " + minValue);
        found = true;
    }
}

if(!found) {
    System.out.println("No Saddle Point");
}

}
}
