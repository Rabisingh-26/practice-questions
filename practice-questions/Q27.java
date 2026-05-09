
//Longest Palindromic Substring
import java.util.*;

public class Q27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        String ans = "";

        for(int i = 0; i < str.length(); i++) {

            for(int j = i; j < str.length(); j++) {

                String sub = str.substring(i, j + 1);

                if(isPalindrome(sub)) {

                    if(sub.length() > ans.length()) {
                        ans = sub;
                    }
                }
            }
        }

        System.out.println("Largest Palindrome: " + ans);
    }

    public static boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while(start < end) {

            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}