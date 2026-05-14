
//Finding the Second Largest Number in an Array

import java.util.*;

public class Q47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] > largest) {

                secondlargest = largest;
                largest = arr[j];

            } 
            else if (arr[j] < largest && arr[j] > secondlargest) {

                secondlargest = arr[j];

            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest Number: " + secondlargest);
    }
}