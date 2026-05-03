//Finding Fibonnaci series at a specific position
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Position:");
        int n = sc.nextInt();
        int first=0,second=1; 
        int next=0;
        if(n==1){
            System.out.println(first);
           
        }
        else if(n==2){
            System.out.println(second);
        }
        else{
            for(int i=3;i<=n;i++){
               next = first + second;
               first=second;
               second = next; 
            }
           System.out.println(second);

        }
    }
}
