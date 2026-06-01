//Floyd's Triangle Variants
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows:");
        int n =sc.nextInt();

        //variant-1
        int count=1;
        System.out.println("variant-1");
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
               System.out.print(j + " ");
               count++;
            }
            System.out.println();
        }

        //Variant-2
        System.out.println("variant-2");

        int num=0;
        for(int i=1;i<=n;i++){

               
            for(int j=1;j<=i;j++){

                num = num +2;
                System.out.print(num + " ");

            }
            System.out.println();
        }

        //variant-3
        System.out.println("Variant-3");
        
        int candidate=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                while(true){
                    boolean isPrime = true;
                    for(int k=2;k<=Math.sqrt(candidate);k++){

                        if(candidate%k == 0){
                            isPrime = false;
                            break;
                        }

                    }
                    if(isPrime){
                        System.out.print(candidate+ " ");
                        candidate++;
                        break;
                    }
                      candidate++;
                }
            }
            System.out.println();
        }
    }
}
