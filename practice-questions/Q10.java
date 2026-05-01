//Temperature Conversion

import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        int temp = sc.nextInt();

        float far = (temp*9.0f/5.0f)+32;
        System.out.println(far);
    }
}