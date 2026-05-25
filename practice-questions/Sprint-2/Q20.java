//Hollow diamond
import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of diamond:");
        int n = sc.nextInt();
        
        if(n>1){
            //upper half
            for(int i=1;i<=n;i++){//rows 
             
                for(int j=1;j<=n-i;j++){//spaces
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    if(k==1 || k==(2*i-1)){
                        System.out.print(i);   
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                
                System.out.println();
            }

            //lowe half
            for(int i=n-1;i>=1;i--){

                for(int j=n-i;j>=1;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    if(k==1 || k==2*i-1){
                      System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.print("the value must be greater than 0.");
        }
    }
    
}
