//https://leetcode.com/problems/frog-jump/description/
/*
403. Frog Jump
Solved
Hard
Topics
Companies
A frog is crossing a river. The river is divided into some number of units, and at each unit, there may or may not exist a stone. The frog can jump on a stone, but it must not jump into the water.

Given a list of stones positions (in units) in sorted ascending order, determine if the frog can cross the river by landing on the last stone. Initially, the frog is on the first stone and assumes the first jump must be 1 unit.

If the frog's last jump was k units, its next jump must be either k - 1, k, or k + 1 units. The frog can only jump in the forward direction.

 

Example 1:

Input: stones = [0,1,3,5,6,8,12,17]
Output: true
Explanation: The frog can jump to the last stone by jumping 1 unit to the 2nd stone, then 2 units to the 3rd stone, then 2 units to the 4th stone, then 3 units to the 6th stone, 4 units to the 7th stone, and 5 units to the 8th stone.
Example 2:

Input: stones = [0,1,2,3,4,8,9,11]
Output: false
Explanation: There is no way to jump to the last stone as the gap between the 5th and 6th stone is too large.
 */
package Leetcode;
public class FrogJump {
    Boolean[][] dp;

    public boolean canCross(int[] stones) {
        int n = stones.length;
        dp = new Boolean[n][n];
        return helper(stones, 0, 0);
    }

    private boolean helper(int[] stones, int index, int lastJump) {
        if (index == stones.length - 1) {
            return true;
        }

        if (dp[index][lastJump] != null) {
            return dp[index][lastJump];
        }

        for (int next = index + 1; next < stones.length; next++) {
            int gap = stones[next] - stones[index];
            if (gap >= lastJump - 1 && gap <= lastJump + 1) {
                if (helper(stones, next, gap)) {
                    return dp[index][lastJump] = true;
                }
            } else if (gap > lastJump + 1) {
                break;
            }
        }

        return dp[index][lastJump] = false;
    }

    public static void main(String[] args) {
        FrogJump frogJump = new FrogJump();

        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17};
        boolean result = frogJump.canCross(stones);

        System.out.println("Can the frog cross? " + result);
    }
}
