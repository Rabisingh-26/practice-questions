//Find All Pythagorean Triplets up to N
import java.util.*;
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt();

        //Brute force
        //for(int a=1;a<=n;a++){
        //    for(int b=a;b<=n;b++){
        //        for(int c =b;c<=n;c++){
        //            if((c*c) == (a*a) + (b*b)){
        //                System.out.print("("+a+","+b+","+c+")");
        //            }
                    
        //        }
        //    }
        //}

        //Euclid's formula:-
        for(int m=2;m<=n;m++){
            for(int k=1;k<m;k++){
                int a = m*m - k*k;
                int b = 2*m*k;
                int c = m*m + k*k;

                if(a>b){
                    int temp = b;
                    b = a;
                    a =temp;
                }

                if(c<=n){
                    System.out.print("("+a+","+b+","+c+")");
                }

            }
        }
    }
}
