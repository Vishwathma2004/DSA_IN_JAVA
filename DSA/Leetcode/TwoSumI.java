//https://leetcode.com/problems/two-sum/description/
/*
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */



public class TwoSumI {
    public static int[] twoSum(int[] nums,int target){
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum = nums[i] + nums[j];
                if(target == sum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
