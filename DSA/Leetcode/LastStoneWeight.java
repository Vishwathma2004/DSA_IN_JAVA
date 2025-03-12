//https://leetcode.com/problems/last-stone-weight/description/
//1046. Last Stone Weight
//You are given an array of integers stones where stones[i] is the weight of the ith stone.

//We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

//If x == y, both stones are destroyed, and
//If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
//At the end of the game, there is at most one stone left.

//Return the weight of the last remaining stone. If there are no stones left, return 0.

package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LastStoneWeight {

    public static int lastWeight(int[] stones) {
        int n = stones.length;
        Arrays.sort(stones);
        
        while (n > 1) {
            int stone1 = stones[n - 1];
            int stone2 = stones[n - 2];
            
            if (stone1 == stone2) {
                n -= 2;
            } else {
                stones[n - 2] = stone1 - stone2;
                n--;
                Arrays.sort(stones, 0, n); // Sort only the active part of the array
            }
        }
        
        return (n == 1) ? stones[0] : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stones: ");
        int n = sc.nextInt();

        int[] stones = new int[n];
        System.out.println("Enter the weight of each stone:");
        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }

        int result = lastWeight(stones);
        System.out.println("Last stone weight is: " + result);

        sc.close();
    }
}
