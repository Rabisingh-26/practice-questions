import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the sze of the array:");
        int n = sc.nextInt();
 
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }

            int target=0;
            for(int i=0;i<n;i++){
                target = target +arr[0][j];

            }
    
            for(int i=0;i<n;i++){
                int sum =0;
                for (int j=0;j<n;j++){
                    sum = sum +arr[i][j];
                }
                    if(sum!=target){
                System.out.println(false);
                return;
            }

        }

        for(int j=0;j<n;i++){
            int sum =0;
            for(int i=0;i<n;i++){

                
            }

        }


        }
    }
}
