// Caesar Cipher Cracker - Try All 26 Shifts
import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter encoded message: ");
        String encoded = sc.nextLine().toUpperCase();

        for (int shift = 1; shift <= 26; shift++) {

            String decoded = "";

            for (int i = 0; i < encoded.length(); i++) {

                char ch = encoded.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {

                    int pos = ch - 'A';

                    pos = (pos - shift + 26) % 26;

                    ch = (char) (pos + 'A');
                }

                decoded += ch;
            }

            System.out.println("Shift " + shift + ": " + decoded);
        }

        sc.close();
    }
}