//The Fermat’s Last Theorem Checker
import java.util.*;
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        System.out.println("enter the limit:");
        int limit = sc.nextInt();

        if(n==2){
            for(int a=1;a<=limit;a++){
                for(int b=1;b<=limit;b++){
                    for(int c=1;c<=limit;c++){
                        if(a*a + b*b == c*c){
                           System.out.println("A: "+a);
                            System.out.println("B: "+b);
                            System.out.println("C: "+c);
                            return;
                        }
                         
                    }
                }
            }
        
          
            }
            else{
            System.out.println("No Solution");
        }
        }
        

    }

