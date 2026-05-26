//Happy Number

public class Q25 {

    public static void main(String[] args) {

        int n = 19;

        while (n != 1 && n != 4) {

            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        System.out.println(n == 1);
    }
}

