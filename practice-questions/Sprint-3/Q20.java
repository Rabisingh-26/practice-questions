//Check Narcissistic Numbers - All Digits
import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits the number will have:");
        int d = sc.nextInt();

        int start = (int)Math.pow(10,(d-1));
        int end = (int)Math.pow(10,d)-1;

        for(int i=start;i<=end;i++){
            int temp=i;
            int sum =0;
            boolean found = false;

            while(temp>0){
                int digit=temp%10;
                int power = (int)Math.pow(digit,d);
                sum = sum +power;
                temp = temp/10;

            }
            if(sum == i){
                found = true;
            }

            if(found){
                System.out.println(i);
              }
  
        }                 
             


    }
}
