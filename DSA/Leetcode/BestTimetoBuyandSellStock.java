//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//121. Best Time to Buy and Sell Stock

//You are given an array prices where prices[i] is the price of a given stock on the ith day.

//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

package Leetcode;

import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public static int MaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) { // Fix the incorrect assignment
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        
        int[] prices = new int[n];
        System.out.println("Enter the stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        
        int result = MaxProfit(prices);
        System.out.println("Maximum Profit: " + result);

        sc.close();
    }
}
