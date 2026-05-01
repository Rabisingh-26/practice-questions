//Reversing the string
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String input = sc.nextLine();
        
        String reversed= reverseString(input);
        System.out.println(reversed);
        
    }

        public static String reverseString(String str){
        String result ="";
        for(int i =str.length()-1;i>=0;i--){
          result = result + str.charAt(i);   
        }
        return result;
    }
        
}

