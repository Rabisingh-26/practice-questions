//Validate and Solve Sudoku (Validator Only)
import java.util.*;
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array:");
        int[][] arr = new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //Row checking
        boolean valid=true;
        for(int i=0;i<9;i++){
            
            int[] freq1 = new int[10];
            for(int j=0;j<9;j++){
                int num = arr[i][j];

                if(num!=0){
                    freq1[num]++;
                    if(freq1[num]>1){
                        valid = false;
                         break;
                    }
                }
            }
        }

        //column checking
        for(int j=0;j<9;j++){

            int freq2[] = new int[10];
            for(int i=0;i<9;i++){
                int num = arr[i][j];
                if(num!=0){
                    freq2[num]++;
                    if(freq2[num]>1){
                        valid = false;
                        break;
                    }
                }
            }
        }

        //checking for 3X3 matrix

        for(int i=0;i<3;i++){
            int freq3[] = new int[10];
            for(int j =0;j<3;j++){
                int num = arr[i][j];
                if(num!=0){
                    if(freq3[num]>1){
                        valid = false;
                        break;
                    }
                }
            }
        }

        if(valid){
            System.out.println("Sudoku is valid.");
        }
        else{
            System.out.println("Sudoku is not valid");
        }

    }
    
}
