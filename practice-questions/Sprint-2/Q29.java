
//Josephus Problem
import java.util.*;

public class Q29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of people: ");
        int n = sc.nextInt();

        System.out.print("Enter the position to eliminate: ");
        int k = sc.nextInt();

        boolean[] remove = new boolean[n];

        int remaining = n;
        int index = 0;
        int count = 0;

        while(remaining > 1){

            if(remove[index] == false){

                count++;

                if(count == k){

                    remove[index] = true;

                    remaining--;

                    count = 0;
                }
            }

        
            index = (index + 1) % n;
        }

      
        for(int i = 0; i < n; i++){

            if(remove[i] == false){

                System.out.println("Survivor: " + (i + 1));
            }
        }
    }
}