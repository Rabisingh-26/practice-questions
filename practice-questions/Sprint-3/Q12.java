
//Roman number converter
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Roman numbers:");
        String s = sc.next();

        int[] val = new int[256];
             val['I'] = 1;
             val['V'] = 5;
             val['X'] = 10;
             val['L'] = 50;
             val['C'] = 100;
             val['D'] = 500;
             val['M'] = 1000;

               
             
             int result = 0;

        // start from right to left
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = val[s.charAt(i)];

            if (curr >= prev) {
                result += curr;
            } else {
                result -= curr;
            }

            prev = curr;
        }

        System.out.println("Integer value:" + result);
        
    }
}
