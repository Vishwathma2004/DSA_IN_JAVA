/*
https://leetcode.com/problems/single-number-iii/description/
260. Single Number III
Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.

Example 2:
Input: nums = [-1,0]
Output: [-1,0]

Example 3:
Input: nums = [0,1]
Output: [1,0]
*/
import java.util.*;
class SingleNumberIII{
    public static int[] singleNumber(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                i=i+2;
            }
            else{
                res.add(nums[i]);
                i++;
            }
        }
        int[] ans = new int[res.size()];
        for(i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
}