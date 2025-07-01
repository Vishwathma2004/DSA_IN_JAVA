/*
https://leetcode.com/problems/minimum-size-subarray-sum/description/
209. Minimum Size Subarray Sum
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1

Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 */
public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindowSize = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum >= target) {
                minWindowSize = Math.min(minWindowSize, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        return minWindowSize == Integer.MAX_VALUE ? 0 : minWindowSize;
    }

    public static void main(String[] args) {
        Minimum_Size_Subarray_Sum solution = new Minimum_Size_Subarray_Sum();

        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        System.out.println(solution.minSubArrayLen(target1, nums1)); // Output: 2

        int[] nums2 = {1, 4, 4};
        int target2 = 4;
        System.out.println(solution.minSubArrayLen(target2, nums2)); // Output: 1

        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int target3 = 11;
        System.out.println(solution.minSubArrayLen(target3, nums3)); // Output: 0
    }
}
