//Zigzag Number Trail
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n = sc.nextInt();
        int num = 1;

for(int i=1; i<=n; i++){

    int start = num;

    
    num = num + i;

    if(i % 2 != 0){

        for(int j=start; j<=num-1; j++){
            System.out.print(j);
        }

    }
    
    else{

        for(int j=num-1; j>=start; j--){
            System.out.print(j);
        }
    }

    System.out.println();
}
    }
}
