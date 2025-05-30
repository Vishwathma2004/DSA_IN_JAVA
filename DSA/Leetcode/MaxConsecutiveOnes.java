//https://leetcode.com/problems/max-consecutive-ones/description/?envType=problem-list-v2&envId=array
/*
485. Max Consecutive Ones

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
 */

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static int maxOnes(int[] nums){
        int max = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int max = maxOnes(nums);
        System.out.println("number of consecutive one is :"+max);
        sc.close();
    }
}
