
//Stock Price - Best Time to Buy and Sell
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price:");
        int n = sc.nextInt();

        
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }

        int minPrice = prices[0];
        int maxProfit = 0;
           
        for(int i=0;i<n;i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

        int  profit = prices[i] - minPrice; 

        if(profit > maxProfit){
            maxProfit = profit;
        }
    }
        System.out.println(maxProfit);
        
    
        
        

        }
    }

