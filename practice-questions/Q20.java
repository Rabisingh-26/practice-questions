

import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first limit:");
        int a = sc.nextInt();
        System.out.println("Enter the second limit:");
        int b = sc.nextInt();

        int sum=0;
        for(int i=a;i<=b;i++){
            if(i%2!=0){
                 sum = sum+i;
                // System.out.println("Addition: "+sum);
            }
        }
          System.out.println("Addition: "+sum);
    }
}
