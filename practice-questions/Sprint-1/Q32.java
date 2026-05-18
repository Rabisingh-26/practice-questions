
//Anagram -- Two words or strings that contain the same characters in the same quantity, but in a different order.

import java.util.*;
public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String1: ");
        String str1= sc.nextLine();
        System.out.println("String2: ");;
        String str2 =sc.nextLine();

        char[] chr1 = new char[str1.length()];
        for(int i=0;i<str1.length();i++){
              chr1[i] = str1.charAt(i);
            //  System.out.println(chr1[i]);
        }
         char[] chr2 = new char[str2.length()];
        for(int j=0;j<str1.length();j++){
              chr2[j] = str2.charAt(j);
            //  System.out.println(chr2[j]);
        }
        Arrays.sort(chr1);
        Arrays.sort(chr2);


       boolean isAnagram = true;
       for(int i =0;i<chr1.length;i++){
        if(chr1[i] != chr2[i]){
            isAnagram = false;
            break;
        }
        }
        if(isAnagram){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
        
    }

