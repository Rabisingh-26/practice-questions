//Finding the Sum of Prime Factors of a Number
import java.util.Scanner;
public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        int sum=0;
        for(int i=2;i<n;i++){
          if(n%i==0){
             boolean isPrime =true;
              for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
              }
              if(isPrime){
                sum = sum +i;
              }
            }
       
        }

            System.out.print(sum);
          }

          }
            
        
     

