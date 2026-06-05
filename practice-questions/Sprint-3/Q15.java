//Word Frequnecy Map
import java.util.*;
public class Q15{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        String[] words = s.split(" ");
    
        for(int i=0;i<words.length;i++){

            int count =0;
            boolean alreadyOccured = false;

            for(int k=0;k<i;k++){
                if(words[i].equals(words[k])){
                    alreadyOccured = true;
                    break;
                }
               
            }
             if(alreadyOccured){
                    continue;
                }

            for(int j=0;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            System.out.println(words[i] + " : "+ count);
        }

           }
}