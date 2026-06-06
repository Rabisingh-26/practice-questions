//Matrix - Saddle Point and Trace
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        int n = sc.nextInt();

        
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

          int sum =0;
        for(int i=0;i<n;i++){
       
            for(int j=0;j<n;j++){
                if(i==j){
                    sum = sum +matrix[i][j];
                }
            }
           
            }
              System.out.println("Trace: "+sum);

             //Saddle point
             boolean found = false;
             for(int i=0;i<n;i++){

                int min = matrix[i][0];
                int colIndex = 0;

                for(int j=0;j<n;j++){

                    if(matrix[i][j] < min){
                        min = matrix[i][j];
                        colIndex =j ;
                    }
                }

                    int max = matrix[0][colIndex];

                    for(int k=0;k<n;k++){
                        if(matrix[k][colIndex]>max){
                            max = matrix[k][colIndex];
                        }
                    }
                    if(min == max){
                        found = true;
                        System.out.print("Saadle Point: "+ min);
                    }
             }
             if(!found){
                System.out.print(" No Saadle Point ");
             }
         
            
        }


    }

