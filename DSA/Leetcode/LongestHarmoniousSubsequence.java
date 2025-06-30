/*
https://leetcode.com/problems/longest-harmonious-subsequence/description/?envType=daily-question&envId=2025-06-30
594. Longest Harmonious Subsequence
We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
Example 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5
Explanation:
The longest harmonious subsequence is [3,2,2,2,3].

Example 2:
Input: nums = [1,2,3,4]
Output: 2
Explanation:
The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

Example 3:
Input: nums = [1,1,1,1]
Output: 0
Explanation:
No harmonic subsequence exists.
 */
import java.util.HashMap;

public class LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                int length = map.get(num) + map.get(num + 1);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence obj = new LongestHarmoniousSubsequence();

        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = obj.findLHS(nums);

        System.out.println("Longest Harmonious Subsequence length: " + result);
    }
}