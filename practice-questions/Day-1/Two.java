//Prime Number

import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num<=1){
            System.out.println("Number is not prime");
        }
        else{
             
            for(int i=2;i<num;i++){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }

            }
            if(isPrime){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }
        sc.close();
        }
    }

