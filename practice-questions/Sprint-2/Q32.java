//Amicable Pair Finder

import java.util.*;
public class Q32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

         int sum1=0;
        for(int i=1;i<=n/2;i++){
           
            if(n%i==0){
              sum1 +=i; 
            }
           
        }
        int m = sum1;
        int sum2=0;

        for(int i=1;i<=m/2;i++){
            if(m%i==0){
                sum2 +=i;
            }
        }
        if(sum1 == m && sum2 == n){
            System.out.print(m + " is the amicable pair");
        }
        else{
            System.out.println("no amicable pair");
        }

        }
    }
