
//The Pythagorean Triplet Finder
import java.util.*;
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n = sc.nextInt();
        
        for(int a=1;a<=n;a++){
            for(int b=1;b<=n;b++){
                for(int c=1;c<=n;c++){

                    if((a*a + b*b == c*c) && a+b+c == n){
                        System.out.print("A:"+a);
                        System.out.print("B:"+b);
                        System.out.print("C:"+c);
                        
                        return;
                        
                    }
                }
            }
        }
        
            System.out.println("None");
        

    }
}
