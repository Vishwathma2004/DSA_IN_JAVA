//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/

// 123. Best Time to Buy and Sell Stock III
// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// Find the maximum profit you can achieve. You may complete at most two transactions.

// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

 

// Example 1:

// Input: prices = [3,3,5,0,0,3,1,4]
// Output: 6
// Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
// Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.

package Leetcode;

import java.util.Scanner;

public class BestTimetoBuyandSellStockIII {
    public static int profit(int[] prices) {
        int buy1 = Integer.MIN_VALUE, sell1 = 0;
        int buy2 = Integer.MIN_VALUE, sell2 = 0;
        for (int price : prices) {
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }
        return sell2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];

        // Taking array elements as input
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // Compute and print the maximum profit
        System.out.println("Maximum Profit: " + profit(prices));

        scanner.close();
    }
}
