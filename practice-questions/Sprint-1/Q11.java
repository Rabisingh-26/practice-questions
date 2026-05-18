
//LCM of two numbers
import java.util.Scanner;
public class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number:");
        int num1 = sc.nextInt();
        System.out.println("Second number:");
        int num2 = sc.nextInt();
        
        int lcm = 0;
        for(int i=1;i<=num1*num2;i++){
            if(i%num1==0 && i%num2==0){
                lcm = i;
                break;
            }
        }
        System.out.println("LCM:"+lcm);
        sc.close();
    }
}