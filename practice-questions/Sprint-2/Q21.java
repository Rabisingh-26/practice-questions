//The Alternating Rectangle
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows:");
        int rows = sc.nextInt();
        System.out.print("Columns:");
        int cols = sc.nextInt();

   
        for(int i=1;i<=rows;i++){

            if(i%2 !=0){//odd row
           
            for(int j=1;j<=cols;j++){
                if(j%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print("#");
                }
            }
        }
            else{
               for(int j=1;j<=cols;j++){
                if(j%2!=0){
                    System.out.print("#");
                }
                else{
                    System.out.print("*");
                }
            }
        
        
           
    }
    System.out.println();
}
}
}


