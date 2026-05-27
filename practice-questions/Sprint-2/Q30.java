//The Collatz Conjecture Steps

import java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int count =0;
        

         while(n>1){
       
            if(n%2==0){
                n = n/2;
            }
            else{
                n = (n*3)+1;
            }
            count++;
           
        }
         System.out.print(count);
        }
    }
    

